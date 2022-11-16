package ch11.sec11_arrays;

import java.util.Arrays;


/**
 * 
 * 비교하려는 object가 Comparable 인터페이스를 구현하는 경우
 *
 */

public class Ex04_ObjectSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "김뚱이");
		Ex04_Member member2 = new Ex04_Member(1, "최시케");
		Ex04_Member member3 = new Ex04_Member(2, "박식혜");
		Ex04_Member[] memberList = { member1, member2, member3 };
		
		Arrays.sort(memberList);
		
		for(Ex04_Member a : memberList)
			System.out.println(a);
	}
	

}
