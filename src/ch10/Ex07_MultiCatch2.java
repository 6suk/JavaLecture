package ch10;

public class Ex07_MultiCatch2 {

	public static void main(String[] args) {
		String data1, data2 = null;
		int value1, value2 = 0;

		try {
			data1 = args[0];
			data2 = args[1];
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//			System.out.println("매개변수 부족하거나 잘못된 숫자입니다");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
