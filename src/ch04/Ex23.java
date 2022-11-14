package ch04;

public class Ex23 {

	public static void main(String[] args) {
		// a*a + b*b = c*c
		// a + b + c = 1000, a < b < c
		// a = 332
		
//		for(int i = 1; i <= 332; i++) {
//			for(int k = 1; k <= i; i++) {
//				if((1000-i-k)*(1000-i-k) == (i*i)+(k*k)) {
//					System.out.printf("a = %d, b= %d, c=%d%n", i,k,(1000-i-k));
//				}
//				
//			}
//		}
		
		for(int a = 1; a <= 1000; a++) {
			for(int b = a + 1; b <= 1000; b++) {
				int c = 1000 - a - b;
				if(c*c == a*a + b*b) {
					System.out.printf("%d, %d, %d",a, b, c);
					break;
				}
			}
		}
		

	}

}
