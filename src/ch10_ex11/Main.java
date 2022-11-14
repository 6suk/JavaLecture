package ch10_ex11;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(100000);
		System.out.println("잔고: " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(150000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("잔고: " + account.getBalance());
		}
	}

}
