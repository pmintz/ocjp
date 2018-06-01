package lambdas;

import java.util.Objects;

public interface LambdaFunction2<T> extends Iterable<T>{ //only public and abstract allowed for modifiers
	//String hi ="hi";
	String call(String s);
	/*
	@Override
	String toString();*/
	
	default void lamfunction(LambdaFunction<T> action){
		  Objects.requireNonNull(action);
	        for (T t : this) {
	            action.call(t);
	        }
		
	}

}
