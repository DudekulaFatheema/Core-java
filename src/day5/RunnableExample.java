package day5;
class Aa implements Runnable {
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
	}
class Bb implements Runnable {
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
	}

	public class RunnableExample {

		public static void main(String[] args) {
			Runnable obj1= new Aa();
			Runnable obj2 = new Bb();
			Thread t1 = new Thread(obj1);  //there is no start method in runnable, 
			Thread t2 = new Thread(obj2); //hence create an object for thread class to invoke run method using start()
			t1.start();
			t2.start();
		}

}
