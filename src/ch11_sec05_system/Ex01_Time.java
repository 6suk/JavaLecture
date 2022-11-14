package ch11_sec05_system;

public class Ex01_Time {

	public static void main(String[] args) {
		long mTime = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		
		System.out.println(mTime +", "+ nanoTime);
		
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i = 1; i<= 100000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~100000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1)+ "나노초가 소요되었습니다.");
	}

}
