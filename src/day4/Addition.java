package day4;

@FunctionalInterface
interface sum {
	int add(int i, int j);
}


public class Addition {
	public static void main(String args) {
		sum a = (i, j) -> i + j;

 int i = a.add(10, 4);
 System.out.println(i);

	}

}
