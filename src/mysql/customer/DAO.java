package mysql.customer;

import java.io.*;
import java.sql.*;
import java.util.*;

/**Data Access Object*/

public class DAO {
	public Connection myGetConn() {
		Connection conn = null;
		try {
			InputStream is = new FileInputStream("D:/[6suk] 개인작업/[멀티캠퍼스]/0. Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();

			String host = props.getProperty("host");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			String database = props.getProperty("database");
			String port = props.getProperty("port", "3306");
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
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
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
