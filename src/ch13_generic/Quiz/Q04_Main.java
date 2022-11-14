package ch13_generic.Quiz;

public class Q04_Main {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPare<String, Integer> childPare = new ChildPare<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPare, "홍삼순");
		System.out.println(childAge);
		
		Pair<String, Integer> pair3 = new Pair<>("고뚱이", 7);
		Integer age3 = Util.getValue(pair3, "고뚱이");
		System.out.println(age3);
		
		Pair2<String, Integer> pair2 = new Pair2<String, Integer>("고뚱이", 7);
		Integer age2 = Util2.getValue2(pair2, "고뚱이");
		System.out.println(age2);
		
	}
	

	
			

}
