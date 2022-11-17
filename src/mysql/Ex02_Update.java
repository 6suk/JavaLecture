package mysql;

import java.sql.*;

public class Ex02_Update {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/world", 
			        "mcuser", "0000");
//		String sql = "UPDATE koreanCity SET `name` = '서울' WHERE Id = 2331;";
			String sql = "UPDATE koreanCity SET `name` = ? WHERE Id = ?;";
			String city = "서울";
			int id = 2331;

			// mySQL에 update 하기 전 준비
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city);
			pstmt.setInt(2, id); // 물음표 채우기

			// Update 실행 (결과가 생기지 않는다)
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
