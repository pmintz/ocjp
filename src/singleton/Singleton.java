package singleton;

import singleton.Logger;

public class Singleton {
	
	private static Singleton s;
	
	private Singleton(String t){System.out.println("Inside constructor: " + t);}
	
	public static synchronized Singleton getSingleton(String x){
		
		if( s == null)
		s = new Singleton("initializing: " + x );
		return s;
	}
	
	public static void main(String []args){
		Logger l = Logger.getInstance();
		l.log("yes");
		Logger g = Logger.getInstance();
		g.log("no");
		
		
	}
}
