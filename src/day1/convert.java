package day1;

import java.util.Scanner;

public class convert {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int i=sc.nextInt();
	System.out.println("enter the number");
	long l=sc.nextLong();
	String str=Integer.toString(i);
	String st=Long.toString(l);
	System.out.println(str);
	System.out.println(st);

}
}