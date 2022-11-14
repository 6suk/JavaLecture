package ch11_sec07_string;

import java.io.UnsupportedEncodingException;

public class Stringex {

	public static void main(java.lang.String[] args) {

		String str = "안녕하세요! 고예림입니다";

		System.out.println("=================================");

		char value1 = str.charAt(3);	// 세
		System.out.println(value1);	

		System.out.println("=================================");

		System.out.println(str.equals(args));	// false

		System.out.println("=================================");

		byte[] value2 = str.getBytes();
		System.out.println(value2);

		try {
			byte[] value3 = str.getBytes("EUC-KR");
			byte[] value4 = str.getBytes("UTF-8");
			System.out.println(value3 + ", " + value4);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("=================================");

		int b = str.indexOf("고예림");	// 7
		
		System.out.println(b);
		
		System.out.println("=================================");
		
		String c = str.replace("고예림", "홍길동"); // 안녕하세요! 홍길동입니다
		System.out.println(c);
		
		System.out.println("=================================");
		
		str = "880815-1234567";
		String d = str.substring(7);
		String e = str.substring(0, 6); //?????
		System.out.printf("%s%n%s%n",d,e);
		
		System.out.println("=================================");

		String f = "AbcdEfGHijklmn";
		d = f.toLowerCase();
		e = f.toUpperCase();
		System.out.printf("%s%n%s%n",d,e);
		
		System.out.println("=================================");
		
		f = "        안녕하세요        젭니다!           ";
		e = f.trim();
		System.out.printf("%s%n",e);
		
		System.out.println("=================================");
		
		d = String.valueOf(3.5);
		e = String.valueOf(3);
		
		System.out.printf("%s%n%s%n",d,e);
		
		
		
		

	}

}