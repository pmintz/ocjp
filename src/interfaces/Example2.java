package interfaces;

@FunctionalInterface 
public interface Example2 {
	int x = 5;
	Example2 Example2 = null;
	
	int Example2Method();
	
	default int Example2MethodB(){
		
		System.out.println(Example2Method());
		return this.x;
	}
	
	default Example2 returnClass(){
		return Example2;
	}

}
