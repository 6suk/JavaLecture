package ch04;

public class Ex24 {

	public static void main(String[] args) {
		// 완성된 다이아몬드 그리기
		
		int num = 10;
		int half = num / 2; //3
		
		
		// 윗변
		for(int i = 1; i <= half + 1; i++) {
			//스페이스
			for(int k = 1; k <= half + 1 - i; k++) {
				System.out.print(" ");
			}
			// 별
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아랫변
		for(int i = half; i >= 1; i--) {
			//스페이스
			for(int k = 1; k <= half + 1 - i; k++) {
				System.out.print(" ");
			}
			// 별
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
