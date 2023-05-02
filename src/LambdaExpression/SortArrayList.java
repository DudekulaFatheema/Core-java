package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		  List<String> names=new ArrayList<String>();
		  names.add("mario");
		  names.add("sarala");
		  names.add("haseena");
		  names.add("jakheer");
		  names.add("teju");
		     
		  //print before sorting
		  System.out.println("names before sorting");
		  System.out.println(names);
		  
		  
		  //let sort this array using lambda Expression
		  names.sort((f1,f2)->f1.compareTo(f2));{
			  	//print list after sorting
			  System.out.println("names After sorting");
			  System.out.println(names);
		  }
			}

}
