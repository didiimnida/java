
public class App {

	public static void main(String[] args) {
		
//		int value = 7; //Value type
		
		int[] values; //Reference.
		
		values = new int[3]; //Uses new keyword to allocate memory to hold 3 integers.
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		//Print by line.
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//Print with loop.
		for(int i=0; i< values.length; i++){
			System.out.println(values[i]);
		}
		
		//Define array this way!
		int[] numbers = {5,6,7};
		for(int i=0; i< numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
	}

}
