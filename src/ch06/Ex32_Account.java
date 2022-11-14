package ch06;

public class Ex32_Account {
	
	// 0 < = balance <= 1,000,000
	// setter getter
	// 상수 선언 MIN / MAX
	
	private int balance;
	static final int MIN_BAL = 0;
	static final int MAX_BAL = 1000000;
		
		
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance + this.balance >= MIN_BAL && balance + this.balance <= MAX_BAL)
			this.balance += balance;
		
//		if(balance >= MIN_BAL && balance <= MAX_BAL)
//			this.balance = balance;
	}
	
	
	
	
}
