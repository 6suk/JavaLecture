package ch11.sec07_string;

public class Q04_NumberCount {

	public static void main(String[] args) {

		String number = "";
		for (int i = 1; i <= 100; i++) {
			number += i;
		}
		System.out.println(number);
		System.out.println(String.count(number,"1"));


		
	}

}
