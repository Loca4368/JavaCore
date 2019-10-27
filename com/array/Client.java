package com.array;

public class Client {

	public static void main(String[] args) {

		// Test on Two-dimensions array
		System.out.println("============ Start of Two Dimension String Array =========");
		String[][] stArray = new String[3][];
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
		System.out.println("Length of Array is: " + stArray.length); // Array length attribute
		System.out.println("Length of Array[1] is:" + stArray[1].length);
		System.out.println("Length of String in index[2][1] is:" + stArray[2][1].length()); // String length() method

		System.out.println("Printing array elments...");
		for (int i = 0; i < stArray.length; i++) {
			for (int j = 0; j < stArray[i].length; j++) {
				System.out.print(stArray[i][j] + " ");
			}
		}
		System.out.print("\n");
		System.out.println("============ End of Two Dimension String Array =========");
		System.out.print("\n");

		System.out.println("======== Start of Two Dimension int Array ========");
		int[][] intArray = new int[3][3];
		int startNumber = 0;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = startNumber++;
			}
		}

		for (int[] rowsArray : intArray) {
			for (int i : rowsArray) {
				System.out.println(i);
			}
		}

		System.out.println("======== End of Two Dimension int Array ========");
	}
}