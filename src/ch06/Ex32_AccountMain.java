package ch06;

public class Ex32_AccountMain {

	public static void main(String[] args) {
		Ex32_Account acc = new Ex32_Account();
		
		acc.setBalance(10000);
		System.out.println("현재 잔고 : " + acc.getBalance());
		
		acc.setBalance(-100);
		System.out.println("현재 잔고 : " + acc.getBalance());
		
		acc.setBalance(2000000);
		System.out.println("현재 잔고 : " + acc.getBalance());
		
		acc.setBalance(30000);
		System.out.println("현재 잔고 : " + acc.getBalance());
		
	}
}

