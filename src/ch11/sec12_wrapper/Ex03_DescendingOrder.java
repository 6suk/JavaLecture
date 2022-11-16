package ch11.sec12_wrapper;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_DescendingOrder {

	public static void main(String[] args) {
		Integer[] intArr = {8,9,15,23,1,4};
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(intArr));
		
		// Integer Array를 int array로 변경하는것은 Srteam을 통해서
		
		int[] unbox = new int[intArr.length];
		int count = 0;
		for(Integer a : intArr) {
			unbox[count] = a;
			count++;
		}
		
		System.out.println(Arrays.toString(unbox));
		
		
		
	}

}
