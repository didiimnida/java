class Robot {
	//Passing a parameter to the method. 
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping: "+ height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + "meters in direction" + direction);
	}
	
}

public class App {

	public static void main(String[] args) {
		Robot robbie = new Robot();
		
		robbie.speak("Hi, I am Robbie.");
		robbie.jump(7);
		
		robbie.move("West",12.2);
		
		//Can declare and initialize string like this.  
		String greeting = "Hello there.";
		//Call method in the class using the string. 
		robbie.speak(greeting);
		
		//Doesn't work the same with primitives as with class types. 
		//This is value, the other is a reference.  
		int value = 14;
		robbie.jump(value);
		
	}
}




