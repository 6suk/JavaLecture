package ch10;

public class Q01_TryCatch_ArraySum {

	public static void main(String[] args) {
		int[] arr = { 5, 20, 4, 59, 8 };
		int sum = 0, index = 0;

		try {
			while (true) {
				sum += arr[index++];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(sum);
		}

	}

}
