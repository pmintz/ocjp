package io;

import java.io.Console;
import java.util.Arrays;

public class Login {
	String userName;
	char[] password;
	public static void main(String []args){
		Console console = System.console();
		Login l = new Login();
		if(console != null){
			l.userName = null;
			l.password = null;
			
			l.userName = console.readLine("Enter your username: ");
			l.password = console.readPassword("Enter password: ");
			//password is a char[]: convert it to a string first
			if(l.userName.compareTo("mscarpace") == 0 && new String(l.password).compareTo("password") == 0){
			//do not actually hard code these values in real time
			System.out.println("You entered " + l.userName + " for a username");
			System.out.println("You entered ");
				for(char c: l.password){
					System.out.println(c);
				}
			System.out.println("for a passowrd");
			console.printf("login successful \n");
			}
			else{
			console.printf("wrong user name or password\n");
			}
		//empty the password
		Arrays.fill(l.password, ' ');
		System.out.println("Password after Arrays.fill()");
			for(char c: l.password){
				System.out.println(c);
			}
		}

	}
}
