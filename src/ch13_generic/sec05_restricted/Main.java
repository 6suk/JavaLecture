package ch13_generic.sec05_restricted;

public class Main {

	public static void main(String[] args) {
		boolean result1 = Util.compare(10,20);
		System.out.println(result1);
		
		boolean result2 = Util.compare(4.5,4.5);
		System.out.println(result2);
		
		boolean result3 = Util.compare(4,4.5);
		System.out.println(result3);
	}

}
