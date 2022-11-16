package ch15_Collection.sec06_TreeSet;

import java.util.TreeSet;


public class PersonMain {
	public static void main(String[] args) {
		/** Comparable */
		/** 자기 자신과 매개변수 객체를 비교 */
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("고뚱이", 7));
		treeSet.add(new Person("고시케", 2));
		treeSet.add(new Person("정시케", 3));
		treeSet.add(new Person("고시케", 3));

		for (Person person : treeSet)
			System.out.println(person.name + ": " + person.age);
		
		
		
		
	}
}

