package ch11;

import java.util.Arrays;
import java.util.Random;

public class Ex14_Random {

	public static void main(String[] args) {
		Random ran = new Random(2022);
		System.out.println(ran.nextInt(100));

//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = ran2.nextInt(45) + 1;
//			
//		}

		Random ran2 = new Random();
		System.out.println("LOTTO");
		int[] arr = new int[6];
		int index = 0;

		while (index < 6) {
			int num = ran2.nextInt(45) + 1;
			if (!isValidNumber(num, arr))
				continue;
			arr[index++] = num;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static boolean isValidNumber(int num, int[] arr) {
		for (int a : arr)
			if (a == num)
				return false;
		return true;

	}

}
