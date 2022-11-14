package ch11_sec11_arrays;

import java.util.Arrays;

public class Ex02_Equals {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 2, 9 };
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.equals(arr, arr1));
		
		int[][] arr2 = {{4,8},{2,9}};
		int[][] arr3 = Arrays.copyOf(arr2, arr2.length);
		System.out.println(Arrays.equals(arr2, arr3));
		
		arr2[0][0] = 1;
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.deepToString(arr3));	// 값이 같이 바뀐다.
		
		//깊은복제 arr2를 arr4에 복제
		int[][] arr4 = Arrays.copyOf(arr2, arr2.length);
		arr4[0] = Arrays.copyOf(arr2[0], arr2[0].length);
		arr4[1] = Arrays.copyOf(arr2[1], arr2[1].length);
		
		//배열 번지 비교
		System.out.println(Arrays.equals(arr2, arr4));
		
		//배열 값 비교
		System.out.println(Arrays.deepEquals(arr2, arr4));
		
		arr4[0][0] = 3;
		System.out.println(Arrays.equals(arr2, arr4));
		System.out.println(Arrays.deepEquals(arr2, arr4));
	}

}
