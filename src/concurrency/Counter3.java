package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class Counter3 {
	public static Integer integer = new Integer(0);
	public static AtomicInteger atomicInteger = new AtomicInteger(0);
	//public static int count;
	//public static int count2;
}
	class AtomicVariableTest {
		static class Incrementer extends Thread {
			public void run() {
				//System.out.println("Inside Incrementer");
				//Counter3.count++;
				//System.out.println(Counter3.count);
				System.out.println(Counter3.integer++);
				System.out.println(Counter3.atomicInteger.incrementAndGet());
				}
		}
		static class Decrementer extends Thread {
			public void run() {
				//System.out.println("Inside Decrementer");
				//Counter3.count2++;
				//System.out.println(Counter3.count2);
				//System.out.println(Counter3.integer--);
				System.out.println(Counter3.atomicInteger.decrementAndGet());
			}
		}
		public static void main(String []args) throws InterruptedException {
			Thread incremeterThread[] = new Incrementer[1000];
			Thread decrementerThread[] = new Decrementer[1000];

			for(int i = 0; i < 1000; i++) {
				//incremeterThread[i] = new Incrementer();
				decrementerThread[i] = new Decrementer();
				//incremeterThread[i].start();
				decrementerThread[i].start();
				decrementerThread[i].join();
			}
			for(int i = 0; i < 1000; i++) {
				//incremeterThread[i].join();
				decrementerThread[i].join();
			}
			System.out.printf("Integer value = %d AtomicInteger value = %d ",
					Counter3.integer, Counter3.atomicInteger.get());
		}
}
