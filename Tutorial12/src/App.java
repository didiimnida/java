
public class App {

	public static void main(String[] args) {
		//int[] values = {3,5,2343};
		//System.out.println(values[2]);
		
		//2D Array.
		int[][] grid = {
				{3,5,333}, //row0
				{2,34},   //row1
				{12,3,4,53,34} //row2
		};
		//Each element is a reference to an array.  
		
		//System.out.println(grid[1][0]);
		//System.out.println(grid[0][2]);
		
		for(int row=0; row<grid.length; row++){
			for(int col=0; col < grid[row].length; col++){
				System.out.print(grid[row][col]+ "\t"); //
			}
			System.out.println(); //Want a line break after each row.  
		}
		
		//Create a 2D array of references to strings.  
		String[][] tests = new String[2][3];
		
		System.out.println(tests[0][1]);
		tests[0][1] = "Hello!";
		System.out.println(tests[0][1]);
		
		//Create another 2D array of refs to strings.
		String[][] words = new String[2][];
		System.out.println(words[0]);
		//Can define each row separately.  
		words[0] = new String[3];
		words[0][1] = "hi";
		System.out.println(words[0][1]);
		
	}

}
