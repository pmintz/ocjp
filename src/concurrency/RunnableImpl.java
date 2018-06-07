package concurrency;

class RunnableImpl implements Runnable {
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In run(); thread name is: " +
				Thread.currentThread().getName());
	}
	public static void main(String args[]) throws Exception {
		Thread myThread = new Thread(new RunnableImpl());
		myThread.start();
		System.out.println("In main(); thread name is: " +
				Thread.currentThread().getName());
	}
}
