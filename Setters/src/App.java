class Frog {
	//If private, can't access directly from main. Need to use setters. 
	private String name;
	private int age = 29;
	
	//Old Way:
	//public void setName(String newName){
	//name = newName;
	//}
	
	//this Way:
	//this is a reference to the object we are in. 
	public void setName(String name){
		this.name = name;
	}
	
	//Old Way:
	//public void setAge(int newAge){
	//	age = newAge;
	//}
	
	//this Way:
	public void setAge(int age){
		this.age = age;
	}
	
	//GETTERS:
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	//METHODS: 
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping: "+ height);
	}

}

public class App {

	public static void main(String[] args) {
		Frog diana = new Frog();
		//diana.name = "Diana Frog";
		//diana.age = 29;
		//System.out.println(diana.getName());
		diana.setName("Frog Diana");
		diana.setAge(22);
		System.out.println(diana.getAge());
		System.out.println(diana.getName());
	}
}
