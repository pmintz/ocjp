package interfaces;

import java.util.function.IntConsumer;

public class Test extends Test2  /*AbstractClass*/
implements IntConsumer, Example {

	/*Test(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		//AbstractClass ab = new AbstractClass(2);
		AbstractClass ab;
		ab = new RegularClass();
		ab.method(1);
		Test t = new Test();
		t.Amethod();
		
		t.Example2Method();
	}

/*	@Override
	void method() {
		// TODO Auto-generated method stub
		
	}*/
	
	@Override
	public void Amethod(){
		System.out.println("**A"
				+ " method**");
	}

	@Override
	public void accept(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int Example2MethodB() {
		// TODO Auto-generated method stub
		return 0;
	}

}
