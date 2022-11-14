package javaQuiz;

import java.util.HashSet;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int cnt = 1;
		while (cnt <= 10000) {
			char[] chars = String.valueOf(cnt).toCharArray();
			int tmp = cnt;
			for (char data : chars) {
				tmp += Integer.parseInt(String.valueOf(data));
			}

			if (!set.contains(cnt)) {
				System.out.println(cnt);
				set.add(tmp);
			} else {
				set.add(tmp);
			}

			cnt++;
		}
	}
}
