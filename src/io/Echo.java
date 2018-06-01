package io;

import java.io.Console;

public class Echo {
	
	public static void main(String []args){
		Console c = System.console();
		
		if(c == null){
			System.err.println("Cannot retrieve console object -- are you running the application from and IDE?");
			
			System.exit(-1);
		}
		
		c.printf(c.readLine());
	}
	

}
