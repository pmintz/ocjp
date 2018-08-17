package chap2.singleton;

public class Singleton implements Runnable {
	
	private static Singleton s;// or = new Singleton(""); and remove local object created in getSingleton() method
	//global static varibales are only made once
	
	public static int num;
	
	String x;
	
	private Singleton(String t){System.out.println("Inside constructor: " + t);
		this.x=t;
	}
	
	public static synchronized Singleton getSingleton(){
		System.out.println("Inside getSingleton() method but not creating new object");
		if( s == null){
			System.out.println("Creating new object");
		s = new Singleton("initializing: ");
		}
		return s;
	}
	
	@Override
	public String toString(){
		return x;}
	
	//public static int x = 1;
	
	public static void main(String []args){
		Logger l = Logger.getInstance();
		l.log("yes");
		Logger g = Logger.getInstance();
		g.log("no");
		/*System.out.println(StaticTest.x); 
		System.out.println(StaticTest.x = 2);
		System.out.println(StaticTest.st2.y);
		System.out.println(StaticTest.st2.y = 99);
		System.out.println(StaticTest.getInstance().y);*/
		StaticTest2.getInstance().x=1;
		System.out.println(StaticTest2.st2.x);
		StaticTest2.getInstance().x=2;
		System.out.println(StaticTest2.st2.x);
		StaticTest2.getInstance().x=11;
		System.out.println();
		System.out.println(StaticTest2.st2.x);
		//System.getenv().entrySet().forEach(System.out::println);
		
		
		/*When a variable is declared as static, 
		 * then a single copy of variable is created and shared among all objects at class level. 
		Static variables are, essentially, global variables. All instances of the class share the same static variable.*/
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		getSingleton();
		
	}
}
