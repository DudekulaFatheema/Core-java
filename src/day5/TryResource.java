package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResource {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
int num=0;

try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
{
	System.out.println("Enter the number");
	num=Integer.parseInt(br.readLine());
	System.out.println(num);
}

}
}