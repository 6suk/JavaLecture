package ch04;

public class Ex21_MultiplicationTable {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
//				System.out.println(i + " * "+ k + " = " + i * k);
				System.out.printf("%d * %d = %d%n", i, k, (i * k));
			}
			System.out.println("=============================");
		}

	}

}
