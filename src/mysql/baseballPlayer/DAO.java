package mysql.baseballPlayer;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class DAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** DB접속 정보 가져오기 */
	DAO() {
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
			System.out.println("  [오류] " + e.getMessage());
		}
	}

	/** DB 접속 */
	public Connection myGetConn() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			System.out.println("  [오류] " + e.getMessage());
		}
		return conn;
	}

	/** 1. 선수 목록 */
	public List<Player> getPlayerList() {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM bplayer WHERE bye = 0 ORDER BY FIELD(POSITION,'투수','포수','내야수','외야수');";
		List<Player> playerList = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Player p = new Player();
				p.setNum(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setbDay(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				playerList.add(p);
			}

			rs.close();
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}

	/** 1-1. 선수1명 목록 */
	public Player getPlayer(int num) {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM bplayer WHERE number = ?;";
		Player p = new Player();

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setNum(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setbDay(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setBye(rs.getInt(6));
			}

			rs.close();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	/** 1-2. 방출된 선수 목록 */
	public List<Player> byePlayerList() {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM bplayer WHERE bye = 1 ORDER BY FIELD(POSITION,'투수','포수','내야수','외야수');";
		List<Player> playerList = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Player p = new Player();
				p.setNum(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setbDay(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				playerList.add(p);
			}

			rs.close();
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}

	/** 2. 선수 등록 */
	public void setPlayer(Player p) {
		Connection conn = myGetConn();
		String sql = "INSERT INTO bplayer VALUES(?, ?, ?, ?, ?, 0);";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getNum());
			pstmt.setString(2, p.getName());
			pstmt.setString(3, p.getPosition());
			pstmt.setString(4, String.valueOf(p.getbDay()));
			pstmt.setInt(5, p.getHeight());

			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("  [선수 등록 완료]");
		} catch (SQLException e) {
			System.out.println("  [오류] " + e.getMessage());
		}
	}

	/** 3. 선수 정보 수정 */
	public void updatePlayer(Player p) {
		Connection conn = myGetConn();
		String sql = "UPDATE bplayer SET `name` = ?, `position` = ?, height = ? WHERE number = ?;";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setString(2, p.getPosition());
			pstmt.setInt(3, p.getHeight());
			pstmt.setInt(4, p.getNum());

			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("  [오류] " + e.getMessage());
		}

	}

	/** 4. 선수 방출 */
	public void byePlayer(int num) {
		Connection conn = myGetConn();
		String sql = "UPDATE bplayer SET `bye` = 1 WHERE NUMBER = ?;";

		PreparedStatement pstme;
		try {
			pstme = conn.prepareStatement(sql);
			pstme.setInt(1, num);
			pstme.executeUpdate();
			pstme.close();
			conn.close();
			System.out.println("  " + getPlayer(num).getName()+"선수가 방출되었습니다.");
		} catch (SQLException e) {
			System.out.println("  [오류] " + e.getMessage());
		}

	}

	/** 5. 선수 재입단 */
	public void welcomPlayer(int num) {
		Connection conn = myGetConn();
		String sql = "UPDATE bplayer SET `bye` = 0 WHERE NUMBER = ?;";

		PreparedStatement pstme;
		try {
			pstme = conn.prepareStatement(sql);
			pstme.setInt(1, num);
			pstme.executeUpdate();
			pstme.close();
			conn.close();
			System.out.println("  " + getPlayer(num).getName()+"선수가 재입단했습니다.");
		} catch (SQLException e) {
			System.out.println("  [오류] " + e.getMessage());
		}
	}

}
