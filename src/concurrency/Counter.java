package concurrency;

//This class exposes a publicly accessible counter
//to help demonstrate race condition problem
class Counter {
	public static long count = 0;
}
//This class implements Runnable interface
//Its run method increments the counter three times
class UseCounter implements Runnable {
	public void increment() {
		//increments the counter and prints the value
	//of the counter shared between threads
		synchronized (this) {

			Counter.count++;
			System.out.println(Counter.count + " " +
			Thread.currentThread().getName());
			
		}
	}
	public void run() {
		increment();
		increment();
		increment();
	}
}
