package mysql.erd.shopping;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ShoppingDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	/** DB접속 정보 가져오기 */
	ShoppingDao() {
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
			System.out.println("[오류 : 접속정보] " + e.getMessage());
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

	public String sql = "";
	public PreparedStatement pstmt;
	public Statement stmt;
	
	public Set<Cart> getCartByOid(int oid) {
		Connection conn = myGetConn();
		sql = "SELECT c.oid, c.pid, c.quantity, p.pname, p.price FROM cart AS c"
				+ "	JOIN product as p"
				+ "	ON c.pid = p.pid"
				+ "	WHERE c.oid = ?;";
		Set<Cart> set = new HashSet<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, oid);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int goid = rs.getInt(1);
				int gpid = rs.getInt(2);
				int quan = rs.getInt(3);
				String pname = rs.getString(4);
				int price = rs.getInt(5);
				Cart c= new Cart(goid,gpid,quan,pname,price);
				set.add(c);
			}
			conn.close(); rs.close(); pstmt.close();
		} catch (SQLException e) {
			System.out.println("[getCartByOid 오류]" + e.getMessage());
		}
		return set;
	}
	
	public Order getOrder(int oid) {

		Set<Cart> set = getCartByOid(oid);
		int totalPrice = 0;
		for(Cart c : set)
			totalPrice += c.getPrice() * c.getQuantity();
		
		Connection conn = myGetConn();
		sql = "SELECT * FROM orders WHERE oid = ?;";
		Order o = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, oid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				o = new Order(rs.getInt(1),rs.getString(2),
						totalPrice,rs.getString(4),set);
			}
			
		} catch (SQLException e) {
			System.out.println("[getOrder 오류]" + e.getMessage());
		}
		
		return o;
	}

}
