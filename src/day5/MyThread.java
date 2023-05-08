package day5;

class Thread1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Hi");

			try {

				Thread.sleep(10);

			} catch (InterruptedException e) {

// TODO Auto-generated catch block

				e.printStackTrace();

			}

		}

	}

}

class Thread2 extends Thread1 {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Hello");

			try {

				Thread.sleep(10);

			} catch (InterruptedException e) {

// TODO Auto-generated catch block

				e.printStackTrace();

			}

		}

	}

}

public class MyThread {

	public static void main(String[] args) {

		Thread1 obj1 = new Thread1();

		Thread2 obj2 = new Thread2();

//System.out.println(obj1.getPriority());

		obj2.setPriority(Thread.MAX_PRIORITY);

		obj1.start();

		obj2.start();

	}

}
