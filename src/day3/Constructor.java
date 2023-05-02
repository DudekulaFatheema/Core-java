package day3;

class Person {
	private String name; 
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public String getName() {
		return name; 
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Constructor {
	public static void main(String[] args) {

		Person p1 = new Person("mario", 2);
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());

		Person p2 = new Person("haseena", 20);
		System.out.println("Name: " + p2.getName());
		System.out.println("Age: " + p2.getAge());

	}
}
