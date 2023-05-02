package day1;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		if(i%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the nnumber is odd");
	}

}
