package io;

import java.io.IOException;

class Read {
	public static void main(String []args) {
		System.out.print("Type a character: ");
		int val = 0;
		try {
			// the return type of read is int, but it returns a byte value!
			val = System.in.read();//irrespective of how many characters you type it will only read first char
		} catch(IOException ioe) {
			System.err.println("Cannot read input " + ioe);
			System.exit(-1);
		}
		System.out.println("You typed: " + val);
	}
}
