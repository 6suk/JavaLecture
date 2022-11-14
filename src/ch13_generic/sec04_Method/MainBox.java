package ch13_generic.sec04_Method;

public class MainBox {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
