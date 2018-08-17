package concurrency;


class MyRunnable implements Runnable
{
	int n;
	public MyRunnable(int num){
		n = num;
	}
	
	public static void main(String[] args){
		MyRunnable my = new MyRunnable(1);
		Thread t = new Thread(my);
		t.start();
		new Thread(new MyRunnable(2)).start();
		MyRunnable my2 = new MyRunnable(3);
		Thread t2 = new Thread(my2);
		t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++){
			System.out.println(n);
			System.out.println("Hello World");
			System.out.println("Hello");
			System.out.println("World");
		}
		
		//System.out.println("hello world");
		
	}
	
}

/* 
   public static void main(String[] args)
	{
       new Thread( new MyRunnable(2) ).start();
   
  }
   public void run() 
	run() 
   {
      for(int i=0; i<n; i++)
      {
         System.out.println("Hello World");
      }
   }
}
*/