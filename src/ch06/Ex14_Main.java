package ch06;
/*
 * private class
 */

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Member mem = new Ex14_Member();
		
//		mem.uid = "admin"; // 사용 불가
		mem.setUid("admin");	//입력할땐 .set
		System.out.println(mem.getUid()); // 가져올땐 .get
		
		mem = new Ex14_Member("admin", "운영자", "1234", "200");
		System.out.println(mem.toString());
		
		
	}

}


//package ch06;
//
//public class Ex14_Main {
//
//	public static void main(String[] args) {
//		Ex14_Member member = new Ex14_Member();
//		member.setUid("admin");
//		System.out.println(member.getUid());
//		
//		member = new Ex14_Member("admin","운영자","1234",30);
//		System.out.println(member.toString());
//	}
//
//}
