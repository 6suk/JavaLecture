package ch11_sec11_arrays;

import java.util.Arrays;

public class Ex06_Search {

	public static void main(String[] args) {
		// 기본 타입 검색
		int[] num = { 78, 84, 92, 68 };
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int index = Arrays.binarySearch(num, 84);
		System.out.println(index);
		
		// 문자열 검색
		String[] arr = "귤 사과 배 딸기".split(" ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		index = Arrays.binarySearch(arr, "귤");
		System.out.println(index);
		
		// 객체 검색
		Ex04_Member m1 = new Ex04_Member(0, "고뚱이");
		Ex04_Member m2 = new Ex04_Member(1, "정시케");
		Ex04_Member m3 = new Ex04_Member(2, "박식혜");
		Ex04_Member[] memberList = {m1,m2,m3};
		Arrays.sort(memberList);
		System.out.println(Arrays.toString(memberList));
		
		for(Ex04_Member a : memberList) {
			System.out.println(a);
		}
		index = Arrays.binarySearch(memberList, m2);
		System.out.println(index);
		
		index = Arrays.binarySearch(memberList, new Ex04_Member(3,"정시케"));
		System.out.println(index);
		
	}

}
