package ch06;

public class Ex16_Main {

	public static void main(String[] args) {

		Ex16_MyArray a = new Ex16_MyArray(4);
		int[] box1 = { 20, 40, 35, 66, 80, 60, 10, 20 };

		a.printArray(box1);
		a.perLine(box1);

		Ex16_MyArray b = new Ex16_MyArray();
		int[] box2 = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
		b.printArray(box2);
		a.perLine(box2);

		// intArray의 분산 = E(X*X) - E(X)*E(X)
		double var = b.getSumOfSquare(box2) / box2.length - 
						b.getAvg(box2) * b.getAvg(box2);
		double std = Math.sqrt(var);

		System.out.println("평균" + b.avg);
		System.out.println("분산" + var);
		System.out.println("표준편차" + std);

	}

}
