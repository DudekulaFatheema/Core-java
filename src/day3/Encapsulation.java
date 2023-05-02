package day3;
 class Person1 {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public class Encapsulation {
	public static void main(String[] args) {
		
		Person1 p = new Person1();
		p.setName("Mario");
		p.setAge(6);
		
				System.out.println("Name: " + p.getName());
		        System.out.println("Age: " + p.getAge());
	}
}
}

 
		
		
	  