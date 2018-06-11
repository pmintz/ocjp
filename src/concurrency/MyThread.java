package concurrency;

class MyThread extends Thread {
	public void run() {
		try {
			sleep(1000);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
			// ignore the InterruptedException - this is perhaps the one of the
			// very few of the exceptions in Java which is acceptable to ignore
		}
		System.out.println("In run(); thread name is: " + getName());
	}	
	public static void main(String args[]) throws InterruptedException {
		Thread myThread = new MyThread();
		myThread.start();
		myThread.join();  //have to start thread before waiting for it to die
		
		System.out.println("In main(); thread name: " +
				Thread.currentThread().getName());
	}
}
