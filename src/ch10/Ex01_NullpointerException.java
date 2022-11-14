package ch10;

public class Ex01_NullpointerException {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.length()); // NullpointerException
		
	}

//	void testStr(String arr) {
//		if(arr != null)
//			System.out.println(arr.length());
//	}
}
