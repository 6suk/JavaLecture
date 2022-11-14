package ch15_Collection_sec06_TreeSet;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
//		return age - o.age;	// 나이 오름차순
//		return o.age - age;	// 나이 내림차순
//		return name.compareTo(o.name);	// 이름 오름차순
//		return o.name.compareTo(name);	// 이름 오름차순
		// 나이, 이름 오름차순
		return (age == o.age) ? name.compareTo(o.name) : age - o.age;
	}
	
	
}
