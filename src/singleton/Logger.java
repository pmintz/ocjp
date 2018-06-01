package singleton;

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
			Singleton q = Singleton.getSingleton("a");
			Singleton r = Singleton.getSingleton("b");
		}
}
