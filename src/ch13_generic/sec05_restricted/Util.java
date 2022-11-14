package ch13_generic.sec05_restricted;

public class Util {
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		System.out.println("t1 : " + t1.getClass().getName());
		System.out.println("t2 : " +t2.getClass().getName());
		return v1 == v2;
	}
}
