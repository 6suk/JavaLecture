package ch11;

import java.util.Scanner;

public class Q02_Caesar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력 ");
		String plainText = scan.nextLine().toUpperCase();
		System.out.print("스텝 입력 ");
		int step = scan.nextInt();
		scan.close();

		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);
		System.out.println(cipher2plain(cipherText, step));
	}

	/* 암호화 */
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				cipherText[i] = c;
				continue;
			}
			char d = (char) (c + step);
			if (d > 'Z')
				d = (char) (d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}

	/* 복호화 */
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				plainText[i] = c;
				continue;
			}
			char d = (char) (c - step);
			if (d < 'A')
				d = (char) (d + 26);
			plainText[i] = d;
		}
		return new String(plainText);

	}

}