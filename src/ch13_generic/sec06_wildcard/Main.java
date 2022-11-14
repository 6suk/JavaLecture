package ch13_generic.sec06_wildcard;

import java.util.Arrays;

public class Main {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "코스1 수강생"
				+ Arrays.toString(course.getStudents()));
	}
	public static void registerCourse2(Course<? extends Student> course) {
		 System.out.println(course.getName() + "코스2 수강생"
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourse3(Course<? super Worker> course) {
		System.out.println(course.getName() + "코스3 수강생"
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourese = new Course<>("일반인 과정", 5);
		personCourese.add(new Person("일반인"));
		personCourese.add(new Worker("직장인"));
		personCourese.add(new Student("일반학생"));
		personCourese.add(new HighStudent("고등학생"));
		personCourese.add(new MiddleStudent("중학생"));
		
		Course<Worker> workCourse = new Course<>("직장인 과정", 5);
		workCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("일반학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new MiddleStudent("중학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourese);
		registerCourse2(studentCourse);
		registerCourse3(workCourse);
		
	}

}
