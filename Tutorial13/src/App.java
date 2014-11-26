
class Person{
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	//Classes can contain
	//1. Data
	//2. Subroutines (methods)
	
	void speak() {
		for(int i=0; i<3; i++){
			System.out.println("My name is " + name + " and I am " + age + " years old.");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}

public class App {

	public static void main(String[] args) {
		//Program starts in main and works through one after the other.  
		//This is the main method. 
		
		//Declaring a variable of type Person.  
		//Creating a person object.
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();  
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		
		//System.out.println(person1.name);
		
		//Can put class in another file. 
		RedFruit apple = new RedFruit();
		apple.name = "Red Delicious";
		System.out.println(apple.name);
	}

}
