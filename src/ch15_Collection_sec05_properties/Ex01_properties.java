package ch15_Collection_sec05_properties;

import java.io.IOException;
import java.util.Properties;

public class Ex01_properties {
	public static void main(String[] args) throws IOException {
		//Properties 컬렉션 생성
		Properties prop = new Properties();
		
		prop.load(Ex01_properties.class.getResourceAsStream("database.properties"));
		
		//주어진 키에 대한 값 읽기
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String admin = prop.getProperty("admin");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(admin);
		
	}
}
