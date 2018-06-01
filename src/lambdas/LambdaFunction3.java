package lambdas;

@FunctionalInterface
public interface LambdaFunction3 {
	
	RandomClass rc = new RandomClass();
	
	RandomClass getRandomClass();
	
	default void lb3Function(){
		System.out.println(this.getClass().toString());
	}

}
