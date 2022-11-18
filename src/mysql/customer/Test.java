package mysql.customer;

import java.time.LocalDate;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		DAO dao = new DAO();
		Customer c1 = new Customer("admin", "관리자", LocalDate.parse("2022-11-17"), 0);
		Customer c2 = new Customer("koandjo", "고예림", LocalDate.parse("2022-11-17"), 0);
		Customer c3 = new Customer("abcd", "고뚱이", LocalDate.parse("2022-11-17"), 0);
		Customer c4 = new Customer("sikesike", "고시케", LocalDate.parse("2022-11-17"), 0);
		Customer c5 = new Customer("sikewithpa", "정식혜", LocalDate.parse("2022-11-17"), 0);
		Customer c6 = new Customer("gdhong", "홍길동");
		Customer c7 = new Customer("gdhong", "홍홍홍", LocalDate.parse("2022-11-17"), 0);
		
		/** 전체 회원 리스트 .getCustomers() */
		List<Customer> list = dao.getCustomers();
		System.out.println("[전체 회원 리스트]");
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
		/** uid로 검색 .getUserInfo() */
		String sUid = "koandjo";
		System.out.println("- 검색한 ID : " + sUid + "\n- 결과 : " + dao.getUserInfo(sUid));
		System.out.println();
		
		/** 회원 내용 변경 .updateUser() */
		dao.updateUser(c7);
		
		
		/** 회원 DB 등록 .insertUser() */
//		dao.insertUser(c1);
//		dao.insertUser(c2);
//		dao.insertUser(c3);
//		dao.insertUser(c4);
//		dao.insertUser(c5);
//		dao.insertUser(c6);
		
		/** 회원 삭제 .deleteUser() */
		System.out.println();
		dao.deleteUser("gdhong");
		System.out.println();
		
		/** 전체 회원 리스트 .getCustomers() */
		List<Customer> list2 = dao.getCustomers();
		System.out.println("[전체 회원 리스트]");
		list2.forEach(x -> System.out.println(x));
		System.out.println();
		
		

	}
}
