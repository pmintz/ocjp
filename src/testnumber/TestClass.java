package testnumber;


public class TestClass extends Thread /*implements Runnable*/ {

	int x= 0, y = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	/*	while(true){
			synchronized(this){
			x++;y++;
			System.out.println("x = " + x + " y = " + y);
			}
		}*/
		
		for(;;);
		
	}
	public static void main(String [] args){
		//TestClass tc = new TestClass();
		System.out.println("main");
		new TestClass().start();
		System.out.println("return from main");
		//new Thread(tc).start();
	}
	
}
