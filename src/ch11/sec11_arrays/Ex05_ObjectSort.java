package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex05_ObjectSort {

	public static void main(String[] args) {
		Ex05_Member member1 = new Ex05_Member(0, "김뚱이");
		Ex05_Member member2 = new Ex05_Member(1, "최시케");
		Ex05_Member member3 = new Ex05_Member(2, "박식혜");
		Ex05_Member[] memberList = { member1, member2, member3 };
		
		Arrays.sort(memberList, new Ex05_MemberComparator());
		for(Ex05_Member a : memberList)
			System.out.println(a);
	}
		Arrays.sort(memberList);

}
