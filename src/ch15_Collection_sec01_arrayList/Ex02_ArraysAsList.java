package ch15_Collection_sec01_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList에 여러개의 데이터를 쉽게 채워넣기
 */

public class Ex02_ArraysAsList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("고뚱이", "고시케", "정시케");
		// Arrays.asList를 이용하면 고정된 사이즈의 리스트로 반환 -> 추가,삭제 불가
		// 배열을 List로 변환할 때 사용
		for(String str : list1)
			System.out.println(str);
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int i : list2)
			System.out.println(i);
		System.out.println();
		
		List<String> list3 = new ArrayList<>();
		for(String str : "고뚱이 고식혜 정시케".split(" "))
			list3.add(str); /** split 메소드로 바로 리스트에 넣기 */
		for(String str : list3)
			System.out.println(str);
		System.out.println(list3.isEmpty());
		
		
	}
}
