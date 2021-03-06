//Car has all the methods that Machine has now using extends. 
public class Car extends Machine{
	
	
	public void wipeWindShield(){
		System.out.println("Wiping windshield!!");
	}
	
	//Overwriting Machine method. Long Way. 
//	public void start(){
//		System.out.println("Car started.");
//	}

	@Override //Annotation w/ Class name. Will check it really is an override.
	public void start() {
		System.out.println("Car started");
	}
	//Eclipse way is right click -> source -> Override/Implement Methods. 
	
	//Get error below b/c declared name private in the Machine class.  
	public void showInfo(){
		System.out.println("Car name: " + name);
	}
}
