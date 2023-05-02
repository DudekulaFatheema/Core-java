package day3;

 class Animal {

	public void speak() {
		System.out.println("The animal makes a sound");
	}
}

  class Dog extends Animal{

	 @Override
	    public void speak() {
	        System.out.println("Woof!");
	    }
}
public class Inheritance {
	public static void main(String[] args) {
		Animal animal  = new Animal();
		animal.speak();
		Dog myDog = new Dog();
        myDog.speak(); 
	}
}

