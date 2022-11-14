package ch11_sec12_wrapper;

public class Ex01_BoxingUnBoxing {

	
	public static void main(String[] args) {
		Integer arr1 = 300;	//박싱
		Integer arr2 = 300;	//박싱
		Double arr3 = 100.;	//박싱
		int value = arr1;	//언박싱
		
		System.out.println(arr1 == arr2);
		System.out.println(arr1.equals(arr3));
		
		
	}

	
}
