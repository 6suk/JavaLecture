package ch15_Collection_advanced;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Employee> ts = new TreeSet<>();
		ts.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
		ts.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
		ts.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
		ts.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
		ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
		ts.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
		ts.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
		ts.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
		ts.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
		ts.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
		// 추가
		ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
		ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
		/***
		 * Join Date가 다른 정마이는 들어가고 position, joinDate가 같은 '한정부'는 안들어간다.
		 */

		ts.forEach(x -> System.out.println(x));
		System.out.println();

		Set<Employee> hs = new HashSet<>();
		hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
		hs.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
		hs.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
		hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
		hs.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
		hs.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
		hs.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
		hs.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
		hs.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
		// 추가
		hs.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
		hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
		/**
		 * id가 다른 한정부는 들어가고, id가 같은 정마이는 안들어간다!
		 */

		hs.forEach(x -> System.out.println(x));
		System.out.println();

		// Stream을 이용하면 순서도 조정할 수 있음(직급, 입사일자 기준)
		hs.stream()
				.sorted((o1, o2) -> o1.getPosition().equals(o2.getPosition())
						? o1.getJoinDate().compareTo(o2.getJoinDate())
						: o1.getPosition().compareTo(o2.getPosition()))
				.forEach(x -> System.out.println(x));

	}

}
