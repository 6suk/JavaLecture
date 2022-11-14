package ch06;

public class Ex01_method {

	public static void main(String[] args) {
		int min = getMin(3,4,5);	//alt + shift + R = 메소드 rename
		System.out.println(min);
		System.out.println(getMin(10,20,5));
	}
	
	static int getMin(int a, int b, int c) {	//static함수이기 때문에 static이 들어가야한다.
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		
		return min;
	}	//공통으로 사용할 구간을 미리 만들어서 편리하게 사용 가능
}
