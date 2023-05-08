package day5;

class A implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hi");
		}

	}

	
}

class B implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");
		}

	}

}

public class Multiplethread {
	public static void main(String args[]) {
		Runnable obj1 = new A();
		Runnable obj2 = new B();
		Thread t1=new Thread(obj1);
        Thread t2 =new Thread(obj2);
        		
		t1.start();
		t2.start();

	}

}
