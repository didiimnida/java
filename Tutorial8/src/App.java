import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		/* A while loop, not DRY.  
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();
		
		while(value != 5){
			System.out.println("Enter a nubmer: ");
			value = scanner.nextInt();
		}
		*/
		
		//Variable scope.  Define here. 
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			//If declare variable here, then it will only exist within brackets.
			value = scanner.nextInt();
		}
		while(value !=5);
		//Checking condition at the end of the loop, so always at least one.
		System.out.println("Got 5!");
		

	}

}
