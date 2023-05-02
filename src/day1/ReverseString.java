package day1;

public class ReverseString {
	public static void main(String args[]) {
		String input = "san";

		String reversed = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			reversed += input.charAt(i);// reversed = reversed + input.charAt(i);

		}

		System.out.println("The reversed string is: " + reversed);

	}
}
