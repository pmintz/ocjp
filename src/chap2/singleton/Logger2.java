package chap2.singleton;

public class Logger2 implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getSingleton();
	}
	
	

}
