package ch11.sec06_class;

public class Ex01_Class {

	public static void main(String[] args) {
		Class clazz = Car.class;
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());
		System.out.println(clazz.getClass());
		
		System.out.println("================================");
		
		try {
			Class clazz2 = Class.forName("ch11_sec06_class.Car");
			System.out.println(clazz2.getPackage().getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

		
	}

}
