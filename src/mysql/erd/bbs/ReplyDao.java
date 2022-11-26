package mysql.erd.bbs;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ReplyDao {
	public static UsersDao userdao = new UsersDao();

	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** DB접속 정보 가져오기 */
	ReplyDao() {
		try {
			InputStream is = new FileInputStream("D:/1.개인작업/Multicampus/Workspace/mysql.properties");
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
	public List<Reply> ReplyList() {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM reply WHERE isdel = '0' ORDER BY regTime, rid;";
		List<Reply> list = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int rid = rs.getInt(1);
				String rcontent = rs.getString(2);
				String regTime = rs.getString(3);
				int isMine = rs.getInt(4);
				String uid = rs.getString(5);
				int bid = rs.getInt(6);
				int isDel = rs.getInt(7);
				
				Reply reply = new Reply(rid, rcontent,regTime,isMine,uid,bid,isDel);
				list.add(reply);
			}
			
			stmt.close();
			conn.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("[댓글 목록 불러오기 오류] : " + e.getMessage());
		}
		
		
		return list;
	}

	/** 2. 생성 */
	public void insertReply(Reply r) {
		Connection conn = myGetConn();
		String sql = "INSERT INTO reply VALUES(DEFAULT, ?, DEFAULT, ?,?,?,DEFAULT);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getRcontent());
			pstmt.setInt(2, r.getIsmine());
			pstmt.setString(3, r.getUid());
			pstmt.setInt(4, r.getBid());
			pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
			System.out.println("[댓글 등록 완료]");
		} catch (SQLException e) {
			System.out.println("[댓글 등록 오류] : " + e.getMessage());
		}
	}

	/** 3. 수정 */
	public void updateReply(Reply r) {
		Connection conn = myGetConn();
		String sql = "UPDATE reply SET rcontent = ?, regTime = NOW() WHERE rid = ?;";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getRcontent());
			pstmt.setInt(2, r.getRid());
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			System.out.println("댓글 수정 완료");
		} catch (SQLException e) {
			System.out.println("[댓글 수정 오류] : " + e.getMessage());
		}
		
		
	}
	
	/** 4. 삭제 */
	public void delReply(int rid) {
		Connection conn = myGetConn();
		String sql = "UPDATE reply SET isDel = 1 WHERE rid = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			System.out.println("댓글 삭제 완료");
		} catch (SQLException e) {
			System.out.println("[댓글 삭제 오류] : " + e.getMessage());
		}
		
	}

}
