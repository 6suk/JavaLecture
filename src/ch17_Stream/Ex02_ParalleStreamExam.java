package ch17_Stream;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ParalleStreamExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("람다식");
		list.add("박병렬");
		
		
		list.parallelStream() /**병렬 스트림 얻기*/
		.forEach(name -> System.out.println(name+" : "+Thread.currentThread().getName()));
		
	}

}
