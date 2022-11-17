package mysql.customer;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		DAO dao = new DAO();
		Customer c1 = new Customer("admin", "관리자", LocalDate.parse("2022-11-17"), 0);
		Customer c2 = new Customer("koandjo", "고예림", LocalDate.parse("2022-11-17"), 0);
		Customer c3 = new Customer("abcd", "고뚱이", LocalDate.parse("2022-11-17"), 0);
		Customer c4 = new Customer("sikesike", "고시케", LocalDate.parse("2022-11-17"), 0);
		Customer c5 = new Customer("sikewithpa", "정식혜", LocalDate.parse("2022-11-17"), 0);
		
		System.out.println(c1);
		dao.insertUser(c1);
		dao.insertUser(c2);
		dao.insertUser(c3);
		dao.insertUser(c4);
		dao.insertUser(c5);
	}
}
