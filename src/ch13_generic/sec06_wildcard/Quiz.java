package ch13_generic.sec06_wildcard;

public class Quiz {

	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		MyArrays.swap(language, 1, 2);
		for (String value : language) {
			System.out.println(value);
		}
	}

	public static class MyArrays {

		public static <T> void swap(T[] t, int a, int b) {
			T tmp = t[a];
			t[a] = t[b];
			t[a] = tmp;
		}

	}

}
