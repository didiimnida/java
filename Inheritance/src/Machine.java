
public class Machine {
	//If define private, can't access from outside class.
	//If protected, can get from outside.  
	protected String name = "I am a machine.";
	
	public void start(){
		System.out.println("Machine started.");
	}
	
	public void stop(){
		System.out.println("Machine stopped.");
	}
	
	
}
