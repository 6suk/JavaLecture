package ch05;

import java.util.Arrays;

public class Ex17_Quiz {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.err.println("두개의 양의 정수를 입력하세요.");
			System.exit(1);	//프로그램 종료
		}
			
		/** 1. 두개의 양의 정수를 입력 받아 int로 변환 (num1,num2) */
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		/** 2-1. 작은 수 찾기 (= num1) */
		int min = (num1 < num2) ? num1 : num2;
		
//		if (num1 > num2) {
//			num1 = Integer.parseInt(args[1]);
//			num2 = Integer.parseInt(args[0]);
//		}

		/** 2-2. 작은 수 길이로 box 배열 선언 */
		int[] box = new int[min];	//tmp : 임시적으로 쓰는 변수명

		/** 3. num1과 num2 공약수를 찾아 box 배열 */
		int index = 0;
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				box[index++] = i;
			}
		}
//		System.out.println(Arrays.toString(box));
//		▶ box 결과[1, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0]

//		/** 4-1. 0 삭제를 위해 box에서 공약수 갯수 카운트 */
//		int count = 0;
//		for (int boxIn : box) {
//			if (boxIn > 0) {
//				count++;
//			}
//		}

//		@@기본 for문 버전@@
//		int count = 0;
//		for (int i = 0; i < box.length; i++) {
//			if (box[i] > 0) {
//				count += 1;
//			}
//		}

//		System.out.println(count);
//		▶ 결과 3

		int[]result = Arrays.copyOf(box, index);
		
//		
//		/** 4-2. 공약수가 카운트된 길이로 result 배열 선언 */
//		int[] result = new int[index];
//
//		/** 5. result 배열에 공약수만 담기 */
//		int reCount = 0;
//		for (int boxIn : box) {
//			if (boxIn > 0) {
//				result[reCount] = boxIn;
//				reCount++;
//			}
//		}

//		@@기본 for문 버전@@
//		int reCount = 0;
//		for (int i = 0; i < box.length; i++) {
//			if (box[i] > 0) {
//				result[reCount] = box[i];
//				reCount += 1;
//			}
//		}

		System.out.printf("%s의 공약수는 %s", Arrays.toString(args), Arrays.toString(result));
	}

}
