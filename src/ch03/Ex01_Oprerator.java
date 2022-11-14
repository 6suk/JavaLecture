package ch03;

public class Ex01_Oprerator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++; //★post increment
		System.out.printf("a = %d, b = %d\n", a, b);
		int c = ++a; //★pre increment
		System.out.printf("a = %d, c = %d%n", a, c);
		
	}

}
