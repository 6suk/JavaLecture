package sessionProject.Java;

import java.util.HashSet;
import java.util.Set;

/**
 * [실습1] Main
 */

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(133, "강자바", "부장", "2000-08-01"));
		set.add(new Employee(143, "은전기", "차장", "2003-01-01"));
		set.add(new Employee(163, "노전자", "과장", "2018-08-01"));
		set.add(new Employee(173, "권표준", "대리", "2022-01-01"));
		set.add(new Employee(213, "홍정부", "사원", "2019-01-01"));

		/** 1. 5명 입력 후 출력 */
		System.out.println("1. 5명 입력 후 출력");
		set.forEach(x -> System.out.println(x));
		System.out.println();

		set.add(new Employee(123, "김자바", "부장", "1998-01-01"));
		set.add(new Employee(163, "노전자", "사원", "2008-08-01"));

		/** 2. 2명 추가 입력 후 전체 출력 */
		System.out.println("2. 2명 추가 입력 후 전체 출력");
		set.forEach(x -> System.out.println(x));

		/** #. 입사일자 오름차순 */
		System.out.println();
		System.out.println("#. 입사일자 오름차순");
		set.stream().sorted((x, y) -> x.getJoinDate().compareTo(y.getJoinDate())).forEach(x -> System.out.println(x));
	}
}
