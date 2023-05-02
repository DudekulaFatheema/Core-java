package day4;

interface Student {
	void data();
}

class school implements Student {

	public void data() {

		String name = "avinash";
		int rollno = 68;
		System.out.println(name);
		System.out.println(rollno);

	}

}

public class Interface {
	public static void main(String args[]) {
		school stu = new school();
		stu.data();
	}
}
