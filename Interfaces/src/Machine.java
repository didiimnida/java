//Can only extend one parent class, but can implement any number of interfaces.

public class Machine implements Info{
	private int id = 7; 
	
	public void start(){
		System.out.println("Started.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is:" + id);
		
	}
	
}
