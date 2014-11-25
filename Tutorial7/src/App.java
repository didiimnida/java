import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Create a scanner object:
		Scanner input = new Scanner(System.in);
		
		//Output the prompt:
		//System.out.println("Enter a line of text: ");
		System.out.println("Enter an integer: ");
		
		//Wait for user to enter line of text.
		//String line = input.nextLine();
		//Can get an integer using the following method: 
		//Will throw an exception if you enter a string.
		int value = input.nextInt(); 
		
		//Tell them what they entered:
		//System.out.println("You entered: "+ line);
		System.out.println("You entered "+ value);

	}

}
