package ch06;

/**
 * 배열에서 사용하면 좋을 법한 프로그램을 메소드로 만들기
 */

public class Ex02_ArrayMethod {

	public static void main(String[] args) {
		int[] intArray = { 43, 24, 46, 89, 3, 24, 90, 101 };

//		for (int i = 0; i < intArray.length; i++) {
//			System.out.printf("%4d", intArray[i]);
//			if ((i + 1) % 4 == 0)
//				System.out.println();
//		}
		
		printArray(intArray);


		int[] intArray2 = { 3, 59, 37, 87, 100, 34, 57, 45 };
		printArray(intArray2);
		
		
		System.out.println("최소값은 " + getMin(intArray));
		System.out.println("평균값은 " + getAvg(intArray));

	}

	static double getAvg(int[] arr) {

		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		return (double) sum / arr.length;
	}

	static void printArray(int[] arr) { // void 더 알아보기
		for (int i = 0; i < arr.length; i++) { // 매개변수 이름은 다르게, 타입은 반드시 일치
			System.out.printf("%4d", arr[i]);
			if ((i + 1) % 4 == 0)
				System.out.println();
		}
	}

	static int getMin(int[] arr) {
		int min = arr[0];
		for (int a : arr) {
			min = (min > a) ? a : min;
		}
		return min;
	}

}
