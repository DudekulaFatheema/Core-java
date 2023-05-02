package day1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		
		
	int i=1  ,first=0,second=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	while(i<=n) 
	{
		System.out.print(first + ", ");
		int third =first+second;
		first=second;
		second=third;
		i++;
				
	}
	

}
}