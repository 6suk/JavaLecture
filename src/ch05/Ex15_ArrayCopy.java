package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 배열 복사 - 1차원 배열에서만 적용됨
 */

public class Ex15_ArrayCopy {

	public static void main(String[] args) {
		int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dst = new int[8];

		for (int i = 2; i < src.length; i++) {
			dst[i - 2] = src[i];
		}
		System.out.println(Arrays.toString(dst)); // for문을 이용해 배열 복사

		String[] srcStr = { "A", "B", "C", "D" };
		String[] dsStr = new String[5];

		System.arraycopy(srcStr, 0, dsStr, 1, srcStr.length);
		System.out.println(Arrays.toString(dsStr)); // System.arrayCopy() 메소드 사용

		int[] newArray = Arrays.copyOf(dst, 8);
		System.out.println(Arrays.toString(newArray)); // Arrays 클래스 이용

		int[] a = { 1, 200, 3 };
		int[] b = new int[5];
		int[] c = Arrays.copyOf(a, 2);

		System.arraycopy(a, 0, b, 0, 2);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}

}
