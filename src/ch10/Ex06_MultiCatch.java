package ch10;

public class Ex06_MultiCatch {

	public static void main(String[] args) {
		String data1, data2 = null;
		int value1, value2 = 0;

		try {
			data1 = args[0];
			data2 = args[1];
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수 부족");
			System.out.println("매개변수 값 2개 기입");
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
