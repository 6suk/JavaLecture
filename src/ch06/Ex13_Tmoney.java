package ch06;
/*
 * [Tmoney card]
 * 
 * 1. 티머니 10,000원 충전
 * 2. 1회 요금 1,350원
 * 3. 금액이 -가 되면 안된다.
 * ex. 잔액이 1,000원일 시 사용불가 + 금액 재충전
 * 
 * 
 */

public class Ex13_Tmoney {

	public static void main(String[] args) {
		Tmoney card = new Tmoney(10000);
		
		while(true) {
			if(!card.ride()) {
				break;
			}
			System.out.println(card.cash);
		}
		card.charge(10000);
		while(true) {
			if(!card.ride()) {
				break;
			}
			System.out.println(card.cash);
		}

	}

}

class Tmoney {
	int cash;

	Tmoney(int cash) { // 생성자
		this.cash = cash;
	}

	boolean ride() { // 메소드
		if (this.cash >= 1350) {
			this.cash -= 1350;
			return true;
		}
		return false;
	}
	
	void charge(int cash) {
		this.cash += cash;
	}

}