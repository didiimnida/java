class Person{
	
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is "+ name + "!");
	}
	
	//Use int instead of void in order to return the int value from method. 
	int calculateYearsToRetirement(){
		int yearsLeft = 67 - age;
		//System.out.println("Years until retirement:" + yearsLeft);
		
		//Need to explicitly return the int. 
		return yearsLeft;
	}
	
	//Getters:
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
	
}
public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Diana";
		person1.age = 29;
		person1.speak();
		//Setting equal to the return value of the method.  
		int years = person1.calculateYearsToRetirement();
		
		System.out.println("Years until retirement:"+ years);
		
		int age = person1.getAge();
		System.out.println("Age is: "+ age);
		
		String name = person1.getName();
		System.out.println("Name is: "+ name);
	}
}
