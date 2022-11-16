package ch15_Collection.sec01_arrayList;

import java.util.HashMap;
import java.util.Map;

public class BoardHashMap {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<>();
		
		for(int i = 1; i<=5; i++)
			map.put(i, new Board("제목"+i, "내용"+i, "글쓴이"+i));
		map.forEach((k,v) -> System.out.println(k + " : " + v));
		
	}
	

}
