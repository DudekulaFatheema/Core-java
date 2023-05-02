package day1;

import java.util.Scanner;

public class Number {
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		if (i<0)
			System.out.println("the given number is negative");
		else if(i>0)
			System.out.println("the given number is positive");
		else
			System.out.println("the number is zero");*/
		
//Write a program that takes two integers as input and prints whether the first integeris greater than, less than, or equal to the second integer.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		System.out.println("Enter a number");
		int j = sc.nextInt();
	if(i>j)
		System.out.println("the first number is grater than second");
	else if(j>i)
		System.out.println("the first number is less than second");
	else if(i==j)
	System.out.println("the number are same");
	}

}
