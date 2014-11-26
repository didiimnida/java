class Machine{
	
	private String name;
	private int code;

	//Name of constructor must be the same as the name of the class. 
	public Machine(){
		//Run more complex constructors from within a simpler one.
		//Must be the first line. 
		this("Diana", 0);
		System.out.println("Constructor running!");
		//name = "Diana";
		
		
	}
	
	public Machine(String name){
		this(name, 0);
		System.out.println("Second constructor running!");
		this.name = name; 
	}
	public Machine(String name, int code){
		System.out.println("Third constructor.");
		this.name = name;
		this.code = code;
	}
	 
	
}

public class App {

	public static void main(String[] args) {
		//Call without parameters, first constructor runs. 
		Machine machine1 = new Machine();
		
		//Call with parameter, second constructor runs. 
		Machine machine2 = new Machine("Bertie");
		
		Machine machine3 = new Machine("Diana", 22);
		
	}

}
