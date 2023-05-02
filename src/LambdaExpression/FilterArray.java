package LambdaExpression;

import java.util.ArrayList;

public class FilterArray {

	public static void main(String args[]) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("mario", 2));
		studentList.add(new Student("has", 15));
		studentList.add(new Student("Jak", 20));
		studentList.add(new Student("Jam", 25));
		studentList.removeIf(student -> (student.age <= 15)); // Lambda Expression
		System.out.println("The final list is: ");
		for (Student student : studentList) {
			System.out.println(student.name);
		}
	}

	private static class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

}
