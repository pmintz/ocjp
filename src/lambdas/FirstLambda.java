package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class FirstLambda<T> implements LambdaFunction3 /*implements Iterable<T>*/ {
	
	Object[] elementData;
	Object [] test;
	String s;
	 int x = 1;
	 
	
	public static void main(String []args) {
		
		 int y = 5;
		
		 int [] ray = new int [2];
		 RandomClass rc = new RandomClass();
		FirstLambda fl = new FirstLambda();
		fl.lb3Function();
		/*LambdaFunction lambdaFunction = x ->{
			//int y; cannot declare same name variable as in enclosing block
			s = "hi"; //the rule mentioned below does not apply to class members
			//y = 6; effectively final so cannot assign value
			rc.x = 9;
			//rc = new RandomClass(); cannot alter references but can alter values pointed to be references
			ray[0] = 4;
			//ray = new int [4];
			System.out.println(x);
			if(y - 1 == 0)
				return x;
				else
					return y;
		};*/
		
		//LambdaFunction2 lb2 = x ->{ return x;};
		//System.out.println(lambdaFunction.call(y));
		//System.out.println(fl.lf2.call("Guava jelly"));
		
		
		System.out.println();
		
		LambdaFunction3 lf3 = () -> rc;
		
		Object o = new Object();
		
		RandomClass2 rc2 = (RandomClass) lf3.getRandomClass();
		
		
		//System.out.println("test array length= " + fl.test.length );
	List list = new ArrayList();
	
	list.add("This");
	list.add("is");
	list.add("a");
	list.add("test");
	
	
	
	for(Object s: list){}
	
	list.forEach((x) -> System.out.println(x));
	
	fl.add("mike");
	fl.add("dinesh");
	fl.add("laurie");
	fl.add(1);
	
	fl.method(w -> System.out.println(w));
	
	Stream.of(list);
	
	}
	
	//public String method(){
		//LambdaFunction2 lf2 = x -> System.out.println(x);
			
			//return lf2.toString();
	//}

	/*	@Override
		public String call(String s) {
			return this.s = s;
			
		}*/
		@Override
		public String toString() {
				return s;
			//return super.toString();
		}

			/*@Override
			public int call(int x) {
				// TODO Auto-generated method stub
				return 0;
			}*/
		 void method(LambdaFunction<? super T> action){
		
		 Objects.requireNonNull(action);
		 final T[] elementData = (T[]) this.elementData;
        for (T t : elementData) {
        	
            action.call(t);
        }
    }

		/*@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}*/
		
		void add(T t){
			if (elementData == null){ elementData = new Object[1]; elementData[0] = t; return;}
			//System.out.println(elementData.length);
			grow(elementData.length, elementData);
			elementData[elementData.length - 1] = t;
			
			
			//System.out.println(elementData.length);
		
		}
		void grow(int x, Object[] o){
			int newCapacity = x + 1;
			elementData = Arrays.copyOf(elementData, newCapacity);
			
		}

		@Override
		public RandomClass getRandomClass() {
			// TODO Auto-generated method stub
			return null;
		}
			
			
		
			
}
