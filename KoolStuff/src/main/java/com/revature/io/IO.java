package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	private static final String outFile = "output.txt";
	private static final String inFile = "input.txt";
	public void writeOutputStreamContents(String contents) {
		OutputStream os = null;
		File file = new File("outFile");
		
		try {
			os = new FileOutputStream(file,false);//false overwrites, true appends to the end
			os.write(contents.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if (os!=null) {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//read a String from a file
	public String readInputStreamContents() {
		InputStream is = null;
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
			
		try {
			is  = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int b = 0;
		try {
			while((b = is.read())!=1){
				char  c = (char)b; //this is parsing, switching from char to int
				s.append(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//we surround this with try catch block bc it may throw and exception
		//learn the syntax and practice what exception will be thrown.
		if(is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return s.toString();
		}
	}
