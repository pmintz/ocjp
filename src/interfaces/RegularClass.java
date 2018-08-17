package interfaces;

public class RegularClass extends AbstractClass implements Example3{

/*	RegularClass(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}*/
	
public RegularClass() {
	// TODO Auto-generated constructor stub
}
	@Override
	void method(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public int Example2Method() {
		// TODO Auto-generated method stub
		return rc.x;
	}
	
	public static void main(String[] args){
		RegularClass rc = new RegularClass();
		Example3 e3 = new RegularClass();
		
		System.out.println(Example3.squared(2));
		System.out.println(e3.plusOne(1));
		System.out.println(e3.Example2MethodB());
		
		System.out.println(/*rc.squared*/ );
		System.out.println(rc.plusOne(1));
		System.out.println(rc.Example2MethodB());
		
		System.out.println();
		System.out.println(rc.Example2Method());
	}

}
