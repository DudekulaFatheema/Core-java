package day4;

import java.util.Scanner;

enum calculator {
	Add, subtraction, Multiplicatin, Divison;

}

public class EnumUsingSwitch {
	public static void main(String args[]) {
		int a, b, result = 0; // Declaring a variables
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number value:");
		a = sc.nextInt(); // getting values from user...
		System.out.print("Enter second number value:");
		b = sc.nextInt();
		calculator c = calculator.subtraction;
		switch (c) {
		case Add:
			result=a+b;
			//System.out.println("result");
			break;
		case subtraction:
			result=a-b;
			//System.out.println("result");
			break;
		case Multiplicatin:
			result=a*b;
			//System.out.println("result");
			break;
		case Divison:
			result=a/b;
			//System.out.println("result");
			break;
		default:
			System.out.println("your operator is not matched");
			break;
		}
		System.out.println(a+" "+c+" "+b+": "+result);

	}

}