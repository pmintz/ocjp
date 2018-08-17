package interfaces;

@FunctionalInterface
public interface Example3 extends Example2 {
	int q = 4;
	
	RegularClass rc = new RegularClass();
	
	
	
	@Override
	String toString();
	
	//int example3(int x); because abstract method from Example2 is inherited 
	//can't have another abstract method without removing functional interface annotation
	
	static int squared(int x){
		return x * x;
	}
	
	default int plusOne(int x){
		return x +1;
	}

}
