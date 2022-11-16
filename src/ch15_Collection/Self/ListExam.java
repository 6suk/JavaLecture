package ch15_Collection.Self;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		// 데이터의 중복이 있을 수 있고, 순서도 있다.
		List<String> list = new ArrayList<>();
		
		// 자료 추가
		list.add("고뚱이");
		list.add("고시케");
		list.add("고뚱이");
		
		// list에 저장된 자료의 수 출력
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			String get = list.get(i);	// 인덱스번째에 있는 자료 출력
			System.out.println(get);
		}
	}
}
