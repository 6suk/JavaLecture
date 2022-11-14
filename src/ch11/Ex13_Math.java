package ch11;

public class Ex13_Math {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println();
		System.out.println("===============절대값================");
		System.out.println(Math.abs(-5));
		System.out.println();
		System.out.println("===============올림값================");
		System.out.println(Math.ceil(5.3));
		System.out.println();
		System.out.println("===============버림값================");
		System.out.println(Math.floor(5.3));
		System.out.println();
		System.out.println("===============최대값================");
		System.out.println(Math.max(10, 5));
		System.out.println();
		System.out.println("===============최소값================");
		System.out.println(Math.min(10, 5));
		System.out.println();
		System.out.println("===============랜덤값================");
		System.out.println(Math.random()*10);
		System.out.println();
		System.out.println("===============가까운 정수의 실수값================");
		System.out.println(Math.rint(5.3));
		System.out.println();
		System.out.println("===============반올림값================");
		System.out.println(Math.round(5.3));
		
		System.out.println((int)Math.pow(5,3));
	}

}
