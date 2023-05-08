package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThread  extends Thread{

    @Override
    public void run() {
    	int sum = 0;
    	
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	//reading the number of elements from the that we want to enter  
    	int n=sc.nextInt();  
    	//creates an array in the memory of length 10  
    	int[] array = new int[10];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++)  
    	{  
    	//reading array elements from the user   
    	array[i]=sc.nextInt();  
    	}  
        
        
        for (int i = 0; i < array.length; i++) { 
        	
            sum = sum + array[i];  
        }
         
		System.out.println("Sum of all the elements of an array: " + sum);  
    }
    public static void main(String[] args) {
    	ArrayThread t = new ArrayThread();
        t.start();



    }
}


