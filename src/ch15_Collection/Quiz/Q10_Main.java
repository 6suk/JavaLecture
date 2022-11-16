package ch15_Collection.Quiz;

import java.util.TreeSet;

public class Q10_Main {

	public static void main(String[] args) {
		TreeSet<Q10_Student> ts = new TreeSet<>();
		ts.add(new Q10_Student("blue", 96));
		ts.add(new Q10_Student("hong", 86));
		ts.add(new Q10_Student("white", 92));

		Q10_Student stu = ts.last();
		System.out.println("최고 점수 : " + stu.score);
		System.out.println("최고 점수를 받은 아이디 : " + stu.id);
		
		/** Comparator로 정렬 기준 바꿔보기 (람다식)*/
		TreeSet<Q10_Student2> ts2 = new TreeSet<>((x, y)-> x.score - y.score);
		ts2.add(new Q10_Student2("blue", 96));
		ts2.add(new Q10_Student2("hong", 86));
		ts2.add(new Q10_Student2("white", 92));
		
		System.out.println();
		
		Q10_Student2 stu2 = ts2.last();
		System.out.println("최고 점수 : " + stu2.score);
		System.out.println("최고 점수를 받은 아이디 : " + stu2.id);

	}

}
