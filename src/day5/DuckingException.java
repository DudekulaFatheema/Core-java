package day5;

public class DuckingException {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		DuckingException obj = new DuckingException();
		obj.p();
		System.out.println("normal flow...");
	}




}
