package mysql;

import java.io.*;
import java.util.*;

public class Ex03_Properties {
	public static void main(String[] args) {
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
			System.out.println(connStr);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
