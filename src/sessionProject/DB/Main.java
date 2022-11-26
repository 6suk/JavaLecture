package sessionProject.DB;

import java.util.*;

/**
 * [실습2] Main
 */

public class Main {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		
		/** 1. createTable */
		dao.createTable();
		System.out.println("-------------------------------------------------------");
		
		
		/** 2. insertEmployee */
		List<EmployeeDTO> list = new ArrayList<>();
		list.add(new EmployeeDTO(133, "강자바", "부장", "2000-08-01"));
		list.add(new EmployeeDTO(143, "은전기", "차장", "2003-01-01"));
		list.add(new EmployeeDTO(163, "노전자", "과장", "2018-08-01"));
		list.add(new EmployeeDTO(173, "권표준", "대리", "2022-01-01"));
		list.add(new EmployeeDTO(213, "홍정부", "사원", "2019-01-01"));
		// 2명 추가
		list.add(new EmployeeDTO(123, "김자바", "부장", "1998-01-01"));
		EmployeeDTO e1 = new EmployeeDTO(163, "노전자", "사원", "2008-08-01");
		
		/** 2-1. 데이터 대량 등록 */
		list.forEach(x -> dao.insertEmployee(x));
		
		/** 2-2. 데이터 개별 등록 */
		dao.insertEmployee(e1);
		System.out.println("-------------------------------------------------------");
		
		/** 3. printAllEmployee */
		dao.printAllEmployee();
		
	}

}
