package day5;
public class CreateThread extends Thread {
    public void show()
    {
        System.out.print("Welcome to thread topic.");
    }
    public static void main(String[] args)
    {
    	CreateThread g = new CreateThread(); // creating thread
        g.show(); // starting thread
    }
}

