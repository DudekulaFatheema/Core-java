package day1;

import java.util.Scanner;

public class LargestNumber {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		System.out.println("Enter a number");
		int j = sc.nextInt();
		System.out.println("Enter a number");
		int k = sc.nextInt();
		if(i>j && i>k)
			System.out.println(i);
		else if(j>i && j>k)
			System.out.println(j);
		else if(k>i && k>j)
			System.out.println(k);
			
	}

}
