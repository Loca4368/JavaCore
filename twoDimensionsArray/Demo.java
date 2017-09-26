package twoDimensionsArray;

public class Demo {

	public static void main(String[] args) {
		
		//Test on Two-dimensions array
		System.out.println("============Test Starting=========");
		String stArray[][] = new String[3][];
		stArray[0] = new String[2];
		stArray[1] = new String[2];
		stArray[2] = new String[2];
		stArray[0][0] = new String("Hello");
		stArray[0][1] = new String("World");
		stArray[1][0] = new String("Ming");
		stArray[1][1] = new String("Qiu");
		stArray[2][0] = new String("O");
		stArray[2][1] = new String("K");
		
		
		
		
		System.out.println("Value in index(1,0) is :" + stArray[1][0]);
		System.out.println("Length of Array is: " + stArray.length);
		
		//For array, use .length,
		System.out.println("Length of Array[1] is:" +stArray[1].length);
		
		//For String, use length()
		System.out.println("Length of String in index[2][1] is:" +stArray[2][1].length()); 
		
		System.out.println("Printing array elments...");
		for(int i = 0; i<stArray.length; i++)
		{
			for(int j = 0; j<stArray[i].length; j++)
			{
				System.out.print(stArray[i][j]+ " ");
			}
		}
		System.out.println("");
		System.out.println("============End of Test=========");
	}


}
