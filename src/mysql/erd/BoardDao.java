package mysql.erd;

import java.io.*;
import java.sql.*;
import java.util.*;

public class BoardDao {

	public static UsersDao userdao = new UsersDao();

	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** DB접속 정보 가져오기 */
	BoardDao() {
		try {
			InputStream is = new FileInputStream("D:/[6suk] 개인작업/[멀티캠퍼스]/0. Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();

			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");

		} catch (Exception e) {
			System.out.println("[오류] " + e.getMessage());
		}
	}

	/** DB 접속 */
	public Connection myGetConn() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			System.out.println("[오류] " + e.getMessage());
		}
		return conn;
	}

	/** 1. 목록 */
	public List<Board> getBoardList() {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM board WHERE isdel = '0' ORDER BY modTime, bid;";
		List<Board> list = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int bid = rs.getInt(1);
				String btitle = rs.getString(2);
				String bcontent = rs.getString(3);
				String buid = rs.getString(4);
				String bmodTime = rs.getString(5);
				int viewC = rs.getInt(6);
				int replyC = rs.getInt(7);
				int isDel = rs.getInt(8);
				Board board = new Board(bid, btitle, bcontent, buid, bmodTime, viewC, replyC, isDel);
				list.add(board);
			}

			stmt.close();
			conn.close();
			rs.close();

		} catch (SQLException e) {
			System.out.println("[목록 불러오기 오류] : " + e.getMessage());
		}

		return list;
	}

	/** 2. 특정 게시물 정보 */
	public Board getBoardInfo(int bid) {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM board WHERE bid = ?;";
		Board b = new Board();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int bidDB = rs.getInt(1);
				String btitle = rs.getString(2);
				String bcontent = rs.getString(3);
				String buid = rs.getString(4);
				String bmodTime = rs.getString(5);
				int viewC = rs.getInt(6);
				int replyC = rs.getInt(7);
				int isDel = rs.getInt(8);
				b = new Board(bidDB, btitle, bcontent, buid, bmodTime, viewC, replyC, isDel);
			}

			pstmt.close();
			conn.close();
			rs.close();

		} catch (SQLException e) {
			System.out.println("[게시물 불러오기 오류] : " + e.getMessage());
		}
		return b;
	}

	/** 2. 생성 */
	public void insertBoard(Board b) {
		Connection conn = myGetConn();
		String sql = "INSERT INTO board VALUES(DEFAULT, ?, ?, ?,DEFAULT,DEFAULT,DEFAULT,DEFAULT);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBtitle());
			pstmt.setString(2, b.getBcontent());
			pstmt.setString(3, b.getUid());
			pstmt.executeUpdate();

			conn.close();
			pstmt.close();
			System.out.println("[게시물 등록 완료]");
		} catch (SQLException e) {
			System.out.println("[게시물 등록 오류] : " + e.getMessage());
		}
	}

	/** 3. 수정 */
	public void updateBoard(Board b) {
		Connection conn = myGetConn();
		String sql = "UPDATE board SET btitle = ?, bcontent = ?, modTime = NOW() WHERE bid = ?;";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBtitle());
			pstmt.setString(2, b.getBcontent());
			pstmt.setInt(3, b.getBid());
			pstmt.executeUpdate();

			pstmt.close();
			conn.close();
			System.out.println("게시물 수정 완료");
		} catch (SQLException e) {
			System.out.println("[게시물 수정 오류] : " + e.getMessage());
		}

	}

	/** 4. 삭제 */
	public void delBoard(int bid) {
		Connection conn = myGetConn();
		String sql = "UPDATE board SET isDel = 1 WHERE bid = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();

			pstmt.close();
			conn.close();
			System.out.println("게시물 삭제 완료");
		} catch (SQLException e) {
			System.out.println("[게시물 삭제 오류] : " + e.getMessage());
		}

	}

	/** 조회수 카운트 */
	public void viewCount(int bid) {
		Connection conn = myGetConn();
		String sql = "UPDATE board SET viewCount = viewCount + 1 where bid = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();

			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("[viewCount오류] : " + e.getMessage());
		}

	}

	/** 게시물 개수 카운트 */
	public int getCount() {
		Connection conn = myGetConn();
		String sql = "SELECT COUNT(*) FROM board WHERE isDel = 0;";
		int count = 0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}
			stmt.close();
			rs.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<Bbs> getBbsList(int offset) {
		Connection conn = myGetConn();
		String sql = "SELECT b.bid, b.btitle, u.uname, b.modTime, b.viewCount, b.replyCount FROM board AS b"
				+ "	JOIN users AS u" + "		ON b.uid = u.uid" + "		WHERE b.isDel = 0" + "	LIMIT 10 OFFSET ?;";

		List<Bbs> list = new ArrayList<>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, offset);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int bid = rs.getInt(1);
				String btitle = rs.getString(2);
				String uname = rs.getString(3);
				String modTime = rs.getString(4);
				int viewC = rs.getInt(5);
				int replyC = rs.getInt(6);
				Bbs bbs = new Bbs(bid, btitle, uname, modTime, viewC, replyC);
				list.add(bbs);
			}
			
			pstmt.close(); conn.close(); rs.close();

		} catch (SQLException e) {
			System.out.println("[bbs 목록 오류] : " + e.getMessage());
		}

		return list;
	}

}
