package ch06;

import java.util.Arrays;

/**
 	ex02 참고
 	
	1) 인스턴스 필드
	한 줄에 출력할 요소의 숫자(elementPerLine)
	
	2) 인스턴스 메소드
	double getAvg(int[]) //평균
	int getMin(int[]) // 가장 작은 수
	void printArray(int[]) // print
	int getMax(int[])	// 가장 큰 수
	int getSumOfSquare(int[]) // 제곱의 합
	
	3) 생성자
	인스턴스 필드를 초기화하는 생성자
 */

public class Ex16_MyArray {

	int numPerLine;
	double avg;
	int min;
	int max;
	int sumOfSqare;
	
	Ex16_MyArray(){
	}
	
	
	public Ex16_MyArray(int numPerLine) {
		super();
		this.numPerLine = numPerLine;
	}


	public Ex16_MyArray(int numPerLine, double avg, int min, int max, int sumOfSqare) {
		super();
		this.numPerLine = numPerLine;
		this.avg = avg;
		this.min = min;
		this.max = max;
		this.sumOfSqare = sumOfSqare;
	}



	// 평균
	double getAvg(int[] arr) {
		int sum = 0;
		for (int a : arr){
			sum += a;
		}
		this.avg = (double)sum / arr.length;
		return avg;
	}
	// 가장 작은 수
	int getMin(int[] arr) {
		int i = arr[0];
		for(int a : arr) {
			i = (a < i) ? a : i;
		}
		this.min = i;
		return min;
	}
	// 가장 큰 수
	int getMax(int[] arr) {
		int i = arr[0];
		for(int a : arr) {
			i = (i < a) ? a : i;
		}
		this.max = i;
		return max;
	}
	
	// 제곱
	int getSumOfSquare(int[] arr) {
		for(int a : arr) {
			this.sumOfSqare += (a*a);
		}
		return sumOfSqare;
	}
	
	void printArray(int[] arr) {
		getAvg(arr);
		getMin(arr);
		getMax(arr);
		getSumOfSquare(arr);
		System.out.printf("%s의%n 평균은 %f%n Min값은 %d%n Max값은 %d%n 제곱을 더한값은 %d%n",Arrays.toString(arr),this.avg,this.min,this.max,this.sumOfSqare);
	}
	
	void perLine(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if ((i + 1) % numPerLine == 0 || (i+1) == arr.length)
				System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Ex16_MyArray [avg=" + avg + ", min=" + min + ", max=" + max + ", sumOfSqare=" + sumOfSqare + "]";
	}
	

}