package ch14_lambda.self;

public class Ex06_LambdaMethod {

	@FunctionalInterface
	public interface Calcuable {
		double calc(double x, double y);
	}

	public class Person {
		public void action(Calcuable calcuable) {
			double result = calcuable.calc(10, 4);
			System.out.println("결과 : " + result);
		}
	}

	public class Computer {
		public static double staticMethod(double x, double y) {
			return x + y;
		}

		public double instanceMethod(double x, double y) {
			return x * y;
		}
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.action(Computer::staticMethod);

//		action(Computer :: instanceMethod);
		Computer com = new Computer();
		person.action(com::instanceMethod);
	}

}
