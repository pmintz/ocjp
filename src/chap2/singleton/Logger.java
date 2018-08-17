package chap2.singleton;

public class Logger {
	private Logger() {
		// private constructor
		System.out.println("same instance buddy");
	}
		public static class LoggerHolder {
			public static Logger logger = new Logger();
		}
		public static Logger getInstance() {
			return LoggerHolder.logger;
		}
		public void log(String s) {
			// log implementation
			//System.err.println(s);
			System.out.println("Am i truly one instance?" + " " + s);
		}
		
		public static void main(String []args){
			/*Singleton q = Singleton.getSingleton("a");
			System.out.println();
			Singleton r = Singleton.getSingleton("b");
			System.out.println();
			System.out.println(r.toString());*/
			//Singleton r = null;
			Logger2 a = new Logger2();
			Thread t = new Thread(a);
			//System.out.println();
			//Singleton p = null;
			Logger2 b = new Logger2();
			Thread t2 = new Thread(b);
			//System.out.println();
			//Singleton z = null;
			Logger2 c = new Logger2();
			Thread t3 = new Thread(c);
			//System.out.println();
			t.start();
			t2.start();
			t3.start();
			
			
		}
		
		/*When a variable is declared as static, 
		 * then a single copy of variable is created and shared among all objects at class level. 
		Static variables are, essentially, global variables. All instances of the class share the same static variable.*/
}
