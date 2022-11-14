package ch10;

public class Ex02_ArrayIndex {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);	//Exception : ArrayIndexOutOfBoundsException
		
		if(args.length == 2) {	// 갯수를 확인하고 넣어라
			System.out.println(args[0]);
			System.out.println(args[1]);
		}else {
			System.out.println("사용법 : 매개변수로 값 2개를 적으세요.");
		}
	}

}
