package ch10;

public class Test {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		//alt + shift + z -> try/catch block
		try {
			System.out.println(a[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("출력합니다.");	// 노출되지 않음
	}

}
