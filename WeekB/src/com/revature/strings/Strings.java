package com.revature.strings;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args)
    {
     /*   System.out.println("Enter the statement you would like to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length()-1; i >=0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("The reversed statement is:");
        System.out.println(reverse);*/
    	
    	int [][] array   = {    {1, 5, 7, 2, 9, 1,2},      {3, 4, 5,6,7},        {3, 4, 5,6,7}       };
    	System.out.println();
    	//this is called iterating over an array
    	for(int i=0; i< array.length; i++) {
    		
    		//when it comes to creating a 2d array, you must iterate the second for loop.
    		//array  [first]    [second]
    		
    		//in this for loop we specified the array.length with [i]. This is because
    		//we want the for loop to read each array on the first dimension, instead of
    		//reading the array index based on how many arrays there are.
    		//think of 2d arrays as an element of an element
    		for(int j=0; j< array[i].length; j++) {
    			System.out.print(array[i][j]);
    		}
    		System.out.println();
    		
    	}
    }
}


