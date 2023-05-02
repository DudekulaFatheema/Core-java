package day2;


	class DisplayOverloading
	{
	  //adding two integer numbers
	  int add(int a, int b)
	  {
	    int sum = a+b;
	    return sum;
	  }
	  //adding three integer numbers
	  int add(int a, int b, int c)
	  {
	    int sum = a+b+c;
	    return sum;
	  }
	}
	public class MethodOverLoading{
	
	  public static void main(String args[])
	  {
	    DisplayOverloading obj = new DisplayOverloading();
	    System.out.println(obj.add(10, 20));
	    System.out.println(obj.add(10, 20, 30));
	  }
	}


