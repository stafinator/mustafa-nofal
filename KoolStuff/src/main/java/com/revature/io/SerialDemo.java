package com.revature.io;

import com.revature.funfactory.Car;

public class SerialDemo {

	public static void main(String[] args) {
		
		IO io = new IO();
//		String a = "Zelda";
//		io.writeOutputStreamContents("Trevor loves to play " + a);
		/*
		 * read from a file
		 */
		//System.out.println(io.readInputStreamContents());
//		Car c1 = hf.getCar("crv" , "blue/green");
//		Car c2 = hf.getCar("civic", "championship white");
//		Car c3 = hf.getCar("potato","clear");
//		
//		IOWithCollections.carList.add(c1);
//		IOWithCollections.carList.add(c2);
//		IOWithCollections.carList.add(c3);
		
		IOWithCollections.readCarFile();
		System.out.println(IOWithCollections.carList.toString());
	}                                                                                                                                              
}
