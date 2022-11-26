package sessionProject.Java;

import java.time.LocalDate;
import java.util.Objects;

/**
 * [실습1] Employee Class
 */

public class Employee {
	
	/** 사번, 이름, 직급, 입사일자 */
	private int id;
	private String name;
	private String position;
	private LocalDate joinDate;
	
	/** 생성자 */
	public Employee() {}
	
	public Employee(int id, String name, String position, String joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = LocalDate.parse(joinDate);
		// 생성자에서 String으로 받아 LocalDate로 변환
	}

	/** toString */
	@Override
	public String toString() {
		return id + ", " + name + ", " + position + ", " + joinDate;
	}
	
	/** hashCode & equals : hashSet 동등객체 비교용 */
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) return false;
		Employee e = (Employee) obj;
		return name.equals(e.name) && id == e.id;
	}

	
	/** getter */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}
	
	
	
	
}
