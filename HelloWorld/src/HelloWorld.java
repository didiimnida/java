public class HelloWorld {

	public static void main(String[] args) {
		int value = 0;
		
		while(value<10)
		{
			System.out.println(value);
			value = value + 1;
		}
		
		for(int i=0; i<5; i++){
			System.out.printf("The value of i is: %d\n", i);
		}
		
		int myInt = 12;
		
		if(myInt <10){
			System.out.println("Yes!");
		} else if (myInt >20){
			System.out.println("No!");
		} else {
			System.out.println("Ok.");
		}
	
	}	
}
