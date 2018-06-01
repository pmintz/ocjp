package lambdas;

@FunctionalInterface
interface LambdaFunction<T> {
	//enum AnotherType{something,or,another};
 void call(T t);
 
 default void lfFunction(){
	 System.out.println("Inside lfFunction");
	 }
 static void lfFunction2(){
	 System.out.println("Inside lfFunction2");
 }
}
