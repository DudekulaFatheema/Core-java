package day4;

enum Trafficlight {
	Red, Green, Yellow;
}

public class Enum {
	public static void main(String args[]) {

		Trafficlight l = Trafficlight.Green;

		if (l == Trafficlight.Red)
			System.out.println("wait for a minute");
		else if (l == Trafficlight.Green)
			System.out.println("you can go");
		else if (l == Trafficlight.Yellow)
			System.out.println("Ready to go");
		

	}
}