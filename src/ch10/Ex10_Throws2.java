package ch10;

/**
 * 
 * throws - main method에서 예외를 떠넘길 수 있다.
 *
 */

public class Ex10_Throws2 {

	public static void main(String[] args) throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String");
		Class clazz2 = Class.forName("java.lang.String2");
	}

}
