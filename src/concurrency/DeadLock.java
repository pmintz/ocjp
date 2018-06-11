package concurrency;

public class DeadLock {
	public static void main(String args[]) throws InterruptedException {
	Counter2 c = new Counter2();
	// create two threads and start them at the same time
	Thread t1 = new Thread(c);
	Thread t2 = new Thread(c);
	t1.start();
	t2.start();
	System.out.println("Waiting for threads to complete execution...");
	t1.join();
	t2.join();
	System.out.println("Done.");
	}
	}
