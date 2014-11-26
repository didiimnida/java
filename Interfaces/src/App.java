//


public class App {

	public static void main(String[] args) {
		//Can't do new and an interface name. 
		Machine mac1 = new Machine();
		mac1.start();

		Person person1 = new Person("Diana");
		person1.greet();
		
		//Making an Info variable...
		Info info1 = new Machine();
		info1.showInfo();
		//Pointing at a Person object now...
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mac1);
		outputInfo(person1);
	}
	
	//Not an App object, so define as static. 
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
