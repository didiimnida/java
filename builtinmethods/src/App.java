class Frog{
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	//Useful for debugging. 
	//Overwriting the toString() method. 
	public String toString(){
		//#1
		//Lots of string objects:
		//Every time put plus between two strings, creating a new string. 
		//return id + ":" + name;
		
		//#2
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
		
		//#3 Similar to printf
		return String.format("%2d: %s", id, name);
		
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Mee");
		Frog frog2 = new Frog(2, "Tan");
		
		
		//When call sysout on an object, Java tries to call toString method. 
		//Will print out the hash code. 
		System.out.println(frog1);
		System.out.println(frog2);

	}

}
