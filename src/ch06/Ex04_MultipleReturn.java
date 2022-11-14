package ch06;

import java.util.Arrays;

/*
 * 반환 값이 여러개인 경우
 * 
 * - 개별 변수로는 반환불가
 * - 자료 구조를 만들어서 반환
 * 
 */

public class Ex04_MultipleReturn {

	public static void main(String[] args) {
		int[] intArray = { 43, 24, 46, 89, 3, 24, 90, 101 };
		printMinMax(intArray);
		int[] result = getMinMax(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	
	static int[] getMinMax(int[] arr) {
		int min = arr[0], max = arr[0];
		
		for(int a : arr) {
			if(a < min)
				min = a;
			if(a > max)
				max = a;
		}
		
		int[] result = {min, max};
		return result;
	}

	private static void printMinMax(int[] arr) {
		int min = arr[0], max = arr[0];
		
		for(int a : arr) {
			if(a < min)
				min = a;
			if(a > max)
				max = a;
		}
		System.out.printf("MIN : %d, MaX : %d%n",min,max);
		
	}
	
//	static int[] printMinMax2(int[] arr) {
//		int min = arr[0], max = arr[0];
//		
//		for(int a : arr) {
//			if(a < min)
//				min = a;
//			if(a > max)
//				max = a;
//		}
//		return min;
////		return max;
//		
//	}

}
