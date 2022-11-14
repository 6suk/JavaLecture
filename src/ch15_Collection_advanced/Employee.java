package ch15_Collection_advanced;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private Position position;
	private LocalDate joinDate;

	public Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}

	/***
	 * 1. id와 name으로 동일한 객체인지 판별 2. 직급별 입사일자 순으로 출력
	 */

	@Override
	public int hashCode() {
//		return this.id + this.name.hashCode();
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee e = (Employee) obj;
		return this.id == e.getId() && name.equals(e.getName());
	}

	@Override
	public int compareTo(Employee o) {
		return position.equals(o.getPosition()) ? joinDate.compareTo(o.getJoinDate())
				: position.compareTo(o.getPosition());
	}

}
