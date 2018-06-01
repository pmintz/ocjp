package interfaces;

public interface Example extends Example2, Example3 {
	int x =2;
	
	void method();
	
	default void remove(){
		throw new UnsupportedOperationException("remove");
	}
	
	default int methodB(){
		method();
		remove();
		Example2MethodB();
		Example2Method();
		return this.x;
	}
	
	@Override
	default int Example2Method() {
		System.out.println("Example2Method from Example");
		return 0;
	}
	
	@Override
	abstract int Example2MethodB();/*{
		Example2Method();
		return this.x;
	}*/

}
