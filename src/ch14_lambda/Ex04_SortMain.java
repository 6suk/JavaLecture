package ch14_lambda;

import java.util.Arrays;

public class Ex04_SortMain {
	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "김뚱이");
		Ex04_Member member2 = new Ex04_Member(1, "최시케");
		Ex04_Member member3 = new Ex04_Member(2, "박식혜");
		Ex04_Member[] memberList = { member1, member2, member3 };
		
		Arrays.sort(memberList, (o1, o2)->{
			return o1.name.compareTo(o2.name);
		});
		for(Ex04_Member member : memberList)
			System.out.println(member);
		
		Arrays.sort(memberList, (o1, o2)-> o1.name.compareTo(o2.name));
		for(Ex04_Member member : memberList)
			System.out.println(member);
		
		// 내림차순 정렬
		Arrays.sort(memberList, (o1, o2)-> o2.name.compareTo(o1.name));
		for(Ex04_Member member : memberList)
			System.out.println(member);
		
		// id 내림차순
		Arrays.sort(memberList,(o1,o2)->o2.id - o1.id);
		for(Ex04_Member member : memberList)
			System.out.println(member);
		
		// id 내림차순
		Arrays.sort(memberList,(o1,o2)->o1.id - o2.id);
		for(Ex04_Member member : memberList)
			System.out.println(member);
		
	}
	
}
