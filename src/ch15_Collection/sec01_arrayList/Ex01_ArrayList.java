package ch15_Collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("JAVA");
		list.add("JDBC");
		list.add("JSP/Servlet");

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		list.add(2, "Database"); // 2번 index에 추가
		list.add("iBATIS");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		list.remove(2); // 1. Database 삭제
		list.remove(2); // 2. JSP/Servlet 삭제
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		for (String str : list) {
			System.out.println(str + " : " + str.length());
		}
		System.out.println();
		
		list.removeIf(s -> s.length() > 5);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
	
	}

}
