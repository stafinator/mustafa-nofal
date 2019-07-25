package com.revature.fizzbuzz;

/*
Basic FizzBuzz: DONE !!!!
Write a method called fizzBuzzBasic which prints out the numbers 1-100, with the following substitutions:
Each multiple of 3 replaced with 'fizz'
Each multiple of 5 replaced with 'buzz'
Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/

/*
Variable-length FizzBuzz with arrays:
Write a method called fizzBuzzAdvanced which prints out the numbers m-n with substitutions of: 
each element of the numbers array replaced by the element at the same index of the terms array.
e.g., to mimic the behavior of fizzBuzzBasic, you would call the method like so:
fizzBuzz4(1,100,[3,5],['fizz','buzz'])
Validation that m <= n is a plus. 
The arrays may have any length, but validation that their length is the SAME is a plus. 
*/
//public void fizzBuzzAdvanced(int m, int n, int[] numbers, String[] terms){}

public class Fizzbuzz {
	public static void main(String[] args) {
		
		int min= 1;
		int max= 100;
		int a = 3;
		int b = 5;
		
		for(int i = min; i <= max; i++) {
	
			if(i %(a*b)==0) {
				System.out.println("FizzBuzz");
			}
			else if(i % a == 0) {
				System.out.println("Fizz");
			}
			else if(i % b == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	
	}

}

	
			

	
	//All i was able to do was get the program to run just the fuzzBuzz Basic portion
	//of the code challenge. Will be working on this code to try and get it running tonight.
		


