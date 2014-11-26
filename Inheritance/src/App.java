
public class App {

	public static void main(String[] args) {
		Machine mac = new Machine();
		mac.start();
		mac.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
	}
}
