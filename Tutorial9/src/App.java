import java.util.Scanner;

public class App {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		int me = input.nextInt(); 
		
		//Most programmers don't use switch.  
		switch (me) {
		case 1:
			System.out.println("Machine started!");
			break;
		case 2:
			System.out.println("Machine stopped!");
			break;
		default: 
			System.out.println("Try again.");
		}
		
	}

}
