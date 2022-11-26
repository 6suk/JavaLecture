package sessionProject.DB;

import java.io.*;
import java.sql.*;
import java.util.*;

/**
 * [실습2] EmployeeDAO
 */

public class EmployeeDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** # Statement / PreparedStatement / sql 미리 선언 */
	public Statement stmt;
	public PreparedStatement pstmt;
	public Connection conn;
	public String sql;

	/** # DB접속 정보 가져오기 */
	EmployeeDAO() {
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
			System.out.println("[오류 : 접속정보] " + e.getMessage());
		}
	}

	/** # DB 접속 */
	public Connection myGetConn() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			System.out.println("[오류 : DB접속] " + e.getMessage());
		}
		return conn;
	}

	/** 1. createTable */
	public void createTable() {
		conn = myGetConn();
		sql = "CREATE TABLE if NOT EXISTS employee (id int NOT NULL PRIMARY KEY, name varchar(4) NOT NULL, position varchar(4) NOT NULL, joinDate datetime);";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql); stmt.close(); conn.close();
			System.out.println("[employee 테이블 생성]");
		} catch (Exception e) {
			System.out.println("[createTable 오류]" + e.getMessage());
		}
	}

	/** 2. insertEmployee */
	public void insertEmployee(EmployeeDTO emp) {
		conn = myGetConn();
		sql = "INSERT INTO employee VALUES(?, ?, ?, ?);"; //id, name, position, joinDate
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getPosition());
			pstmt.setString(4, emp.getJoinDate().toString());
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			System.out.println(emp.getName()+"님 직원 등록 완료!");
		} catch (SQLException e) {
			System.out.println("[insertEmployee 오류] " + e.getMessage());
		}
		
		
	}
	
	/** 3. printAllEmployee */
	public void printAllEmployee() {
		conn = myGetConn();
		sql = "SELECT * from employee ORDER BY joinDate;"; //id, name, position, joinDate
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				EmployeeDTO emp = new EmployeeDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4).substring(0,10));
				System.out.println(emp);
			}
			stmt.close(); conn.close(); rs.close();
		} catch (SQLException e) {
			System.out.println("[printAllEmployee 오류] " + e.getMessage());
		}
	}
	
}
