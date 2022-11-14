package ch06;

import java.util.Scanner;

public class Ex31_BackApp {
	private static Ex31_Account[] accountArray = new Ex31_Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int index = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
//			} else if (selectNo == 4) {
//				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else
				System.out.println("1에서 5까지의 숫자만 입력하세요!");
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("----------------------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------------------------------------------");

		String ano = (1001 + index) + "";
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		System.out.print("최초 입금액 : ");
		int balance = Integer.parseInt(sc.nextLine());

		accountArray[index++] = new Ex31_Account(ano, owner, balance);
		System.out.println("결과 : 계좌가 생성되었습니다.");

	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("----------------------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("----------------------------------------------------------");
		
		for(int i = 0; i<index; i++) {
			System.out.printf("%8s",accountArray[i].getAno());
			System.out.printf("%8s",accountArray[i].getOwner());
			System.out.printf("%,12d%n",accountArray[i].getBalance());
			
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("----------------------------------------------------------");
		System.out.println("예금");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("계좌 번호 > ");
		String ano = sc.nextLine();
		
		Ex32_Account acc = findAccount(ano);
		

	}
//
//	// 출금하기
//	private static void withdraw() {
//
//	}
//
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Ex31_Account findAccount(String ano) {
		for (Ex32_Account acc : accountArray) {
			if (acc == null)
				break;
			if (ano.equals(acc.getAno()))
				return acc;
		}
		
		return null;
	}
}
