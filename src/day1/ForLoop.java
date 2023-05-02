package day1;

import java.util.Scanner;

public class ForLoop {
	public static void main(String args[])
	{
//Write a program that takes an integer as input and prints all the numbers from 1 to that integer. (Use a for loop)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		
		for(int j=1;j<=i;j++) {
			System.out.println(j);
		}*/
//Write a program that takes an integer as input and prints all the even numbers from 2 to that integer. (		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		for (int j=2;j<=i;j++) {
			if(j%2==0)
				System.out.println(j);
		}

	}

}
