package ch11_sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		arr2 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr2));

		char[] arr3 = new char[4];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		arr1[0] = 'j';
		arr3[1] = 'a';
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
