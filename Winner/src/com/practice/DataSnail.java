package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class DataSnail {
	
	static Scanner tinkles = new Scanner(System.in);
	
	
	static ArrayList<String> arrayListName = new ArrayList<>();
	
	
	public static void main(String[] args) {
		getUserInfo();
		getPassWord();
	}



	private static void getUserInfo() {
		System.out.println("Please enter your name");
		String name = tinkles.next();
		System.out.println("i think it worked...ehhh " + name);
		arrayListName.add(name);
//		String j = arrayListName.get(0)
		System.out.println(arrayListName.get(0));
//		{1,2,3}{4,5,6,7}{8,9}
//		
//		
//		1 4 8
//		2 5 9
//		3 6 
//		  7
	}
	
	private static void getPassWord() {
		
	}

}
