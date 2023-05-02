package day2;

import java.util.Arrays;

public class MaxAndMinInArray {
	public static void main(String aregs[]) {
		int array[]= {4,9,6,1,7,8,10,11};
		Arrays.sort(array);
		System.out.println("minimum value " +array[0]);
		System.out.println("maximum value " +array[array.length-1]);
		
	}

}
