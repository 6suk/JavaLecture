package ch11_sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_PrimitiveSort {

	public static void main(String[] args) {
		int[] arr = { 78, 89, 95, 65 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = "감 사과 딸기 귤".split(" ");	//Array 만들 때 꿀팁
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		Arrays.sort(arr2, Comparator.reverseOrder());	// 내림차순
		System.out.println(Arrays.toString(arr2));
		
		Integer[] arr3 = new Integer[arr.length];
		int index = 0;
		
		for (int a : arr){
			arr3[index++] = a;
		}
		
		Arrays.sort(arr3, Comparator.reverseOrder());	// 내림차순
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
