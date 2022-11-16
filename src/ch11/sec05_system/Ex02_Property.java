package ch11.sec05_system;

import java.util.Properties;
import java.util.Set;

public class Ex02_Property {

	public static void main(String[] args) {
		String osName = System.getProperty("os.nemae");
		String userName = System.getProperty("user.neme");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);

		
		// 전체 키와 값을 출력
		System.out.println("----------------------------------------------------------------");
		System.out.println("key : value");
		System.out.println("----------------------------------------------------------------");
	
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s : %s\n",key,value);
		}
		
		
	
	}
	
	

}
