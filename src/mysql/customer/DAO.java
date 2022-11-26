package mysql.customer;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

/** Data Access Object */

public class DAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	DAO() {
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
			System.out.println("오류가 발생했습니다");
			e.printStackTrace();
		}
	}

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

	public void insertUser(Customer user) {
		Connection conn = myGetConn();
		String sql = "INSERT INTO customer(uid,name) VALUES(?,?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, user.getUid());
			pStmt.setString(2, user.getName());

			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			System.out.println("  [가입 완료] " + "ID : " + user.getUid() + " / Name : " + user.getName());
			

		} catch (SQLException e) {
			System.out.println("[오류] " + e.getMessage());
		} 
	}

	public List<Customer> getCustomers() {
		Connection conn = myGetConn();
		List<Customer> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM customer WHERE isDeleted = '0' ORDER BY regdate DESC;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Customer c = new Customer();
				c.setUid(rs.getString(1));
				c.setName(rs.getString(2));
				c.setRegDate(LocalDate.parse(rs.getString(3)));
				c.setIsDeleted(rs.getInt(4));
				list.add(c);
			}
			rs.close();
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("[에러!]" + e.getMessage());
		}
		return list;

	}

	public Customer getUserInfo(String uid) {
		Connection conn = myGetConn();
		String sql = "SELECT * FROM customer WHERE uid = ?;";
		Customer d = new Customer();
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, uid);

			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				d.setUid(rs.getString(1));
				d.setName(rs.getString(2));
				d.setRegDate(LocalDate.parse(rs.getString(3)));
				d.setIsDeleted(rs.getInt(4));
			}
			rs.close();
			conn.close();
			pstm.close();
		} catch (SQLException e) {
			System.out.println("[오류] " + e.getMessage());
		}
		return d;
	}

	public void updateUser(Customer c) {
		Connection conn = myGetConn();

		String sql = "UPDATE customer SET `name` = ?, regDate = ?, isDeleted = ? WHERE uid = ?;";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, c.getName());
			pstm.setString(2, c.getRegDate().toString());
			pstm.setInt(3, c.getIsDeleted());
			pstm.setString(4, c.getUid());
			pstm.executeUpdate();

			pstm.close();
			conn.close();
			System.out.println("  [정보 수정 완료] " + "ID : " + c.getName() + " / Name : " + c.getName()
			+" / regDate : " + c.getRegDate());
		} catch (SQLException e) {
			System.out.println("[오류] " + e.getMessage());
		}

	}
	
	public void updateUser2(String uid, String rename) {
		Connection conn = myGetConn();
		
		String sql = "UPDATE customer SET `name` = ? WHERE uid = ?;";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, rename);
			pstm.setString(2, uid);
			pstm.executeUpdate();
			
			pstm.close();
			conn.close();
			System.out.println("  [정보 수정 완료] " + "ID : " + uid + " / Name : " + rename);
		} catch (SQLException e) {
			System.out.println("[오류] " + e.getMessage());
		}
		
	}

	
	
	
	
	public void deleteUser(String uid) {
		Connection conn = myGetConn();
		String sql = "UPDATE customer SET isDeleted = 1 WHERE uid = ?;";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("  ["+ uid +" : 회원 탈퇴 완료] ");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
