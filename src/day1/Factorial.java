package day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int f=1;
		for (int j=1;j<=num;j++)
			f=f*j;
		System.out.println("Factorial of "+num+" is: "+f);  
		
	}

}
