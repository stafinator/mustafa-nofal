package com.revature.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		// create a 2D array of ints
		int[][] arr1 = new int[10][20];

		// really creating an array of arrays
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		/*
		 * 1 2 3
		 * 4 5 6
		 */

		for (int i = 0; i < arr2.length; i++) { // iterating over rows
			for (int j = 0; j < arr2[i].length; j++) { // iterating over columns in a row
				System.out.println("i = " + i);
				System.out.println("j = " + j);
				System.out.println("arr2[i][j] = " + arr2[i][j]);
			}

		}
	}
	
// Return the largest element in the provided array
    
    public static int largestElement(int[][] arr) {
        int largestElement = arr[0][0];
        
        for (int i = 0; i < arr.length; i++) { // iterating over rows
            for(int j = 0; j < arr[i].length; j++) { // iterating columns in a row
                if (arr[i][j] > largestElement) {
                    largestElement = arr[i][j];
                }
            }
        }
        return largestElement;
    }
    
    // Return the sum of all elements in the provided array
    
    public static int sumElement(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // iterating over rows
            for(int j = 0; j < arr[i].length; j++) { // iterating columns in a row
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
	/*
	 * Sort provided array from top left to bottom right
	 */
	public static int[][] sortArray(int[][] arr) {
		
		
		return null;
	}

}