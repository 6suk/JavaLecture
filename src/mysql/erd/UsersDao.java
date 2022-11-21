package mysql.erd;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.mindrot.jbcrypt.BCrypt;

public class UsersDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** DB접속 정보 가져오기 */
	UsersDao() {
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

//	Connection conn = myGetConn();
//	String sql = "INSERT INTO users VALUES(?,?,?,?,DEFAULT);";

	/** 1. 회원 가입 */
	public void regUser(Users u) {
		Connection conn = myGetConn();
		String sql = "INSERT INTO users VALUES(?,?,?,?,DEFAULT,DEFAULT);";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUid());
			String Bpwd = BCrypt.hashpw(u.getPwd(), BCrypt.gensalt());
			pstmt.setString(2, Bpwd); // 암호화된 패스워드로 DB에 등록
			pstmt.setString(3, u.getUname());
			pstmt.setString(4, u.getEmail());
			pstmt.executeUpdate();

			conn.close();
			pstmt.close();
			System.out.println("[회원가입 완료] id : " + u.getUid() + " | 이름 : " + u.getUname());
		} catch (SQLException e) {
			System.out.println("[회원가입 오류] : " + e.getMessage());
		}

	}

	/** 2. 회원 목록 */
	public List<Users> userList() {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM users WHERE isdel = '0' ORDER BY regDate, uid;";
		List<Users> list = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String uid = rs.getString(1);
				String pwd = rs.getString(2);
				String uname = rs.getString(3);
				String email = rs.getString(4);
				String regDate = rs.getString(5);
				int isDel = rs.getInt(6);
				Users user = new Users(uid, pwd, uname, email, regDate, isDel);
				list.add(user);
			}
			
			stmt.close();
			conn.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("[목록 불러오기 오류] : " + e.getMessage());
		}
		
		
		return list;
	}
	
	/** 3. 특정 회원 목록 */
	public Users getUserInfo(String uid) {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM users WHERE uid = ?;";
		Users u = new Users();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String uid2 = rs.getString(1);
				String pwd = rs.getString(2);
				String uname = rs.getString(3);
				String email = rs.getString(4);
				String regDate = rs.getString(5);
				int isDel = rs.getInt(6);
				u = new Users(uid2, pwd, uname, email, regDate, isDel);
			}
			
			pstmt.close();
			conn.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("[회원 불러오기 오류] : " + e.getMessage());
		}
		return u;
	}
	
	/** 4. 회원 수정 */
	public void updateUser(Users u) {
		Connection conn = myGetConn();
		String sql = "UPDATE users SET pwd = ? , uname = ?, email = ?, regDate = ? WHERE uid = ?;";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getPwd());
			pstmt.setString(2, u.getUname());
			pstmt.setString(3, u.getEmail());
			pstmt.setString(4, u.getRegdate().toString());
			pstmt.setString(5, u.getUid());
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			System.out.println("회원 수정 완료");
		} catch (SQLException e) {
			System.out.println("[회원 수정 오류] : " + e.getMessage());
		}
		
		
	}
	
	/** 5. 회원 탈퇴 */
	public void delUser(String uid) {
		Connection conn = myGetConn();
		String sql = "UPDATE users SET isDel = 1 WHERE uid = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			System.out.println("회원 탈퇴 완료");
		} catch (SQLException e) {
			System.out.println("[회원 탈퇴 오류] : " + e.getMessage());
		}
		
	}
}
