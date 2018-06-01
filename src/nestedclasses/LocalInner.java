package nestedclasses;

import nestedclasses.NonLocalInner.NonLocalInnerNested;

class LocalInner {
	/*static*/ int x;
	NonLocalInner.NonLocalInnerNested foo(/*final*/ NonLocalInner.NonLocalInnerNested //even if you do not 
			//declare final, compiler will effectively treat it as final.
			//This prevents you from assigning another object of the same type. 
			//Rule is: you cannot assign to the variable that you are accessing in the local class.  
			nl){
		//NonLocalInner nl1 = new NonLocalInner();
		int x= 5;
		class LocalInnerNested extends NonLocalInner.NonLocalInnerNested
		{
			int x = 4;
			int y = x;
			
		
			/*LocalInnerNested(int num){
				//nl.super();
				nl1.super();
				y = num;
				System.out.println("y = " + y);
				
			}*/
			public void print(){ System.out.println("Inside Local class");}
			
			@Override
			public String toString(){
				return "You selected a "
						+ "color with "
						+ "RGB values " //;
						+ nl;
			}
		}	
			//nl = new LocalInnerNestedClass.NonLocalInnerNested(); //will cause error.  nl needs to be final or effectively final IF you are using it in your code.  
			//effectively final means that you can leave out final keyword but cannot assign it a new object as 
			//illustrated in the aforementioned line of code.  
			return new LocalInnerNested(/*0*/);
		}
			public static void main(String []args){
				LocalInner sr = new LocalInner();
				//System.out.println(sr.foo());
				//NonLocalInner n = new NonLocalInner();
				NonLocalInner.NonLocalInnerNested  nli =
						sr.foo(
								new NonLocalInner.NonLocalInnerNested(1,1,1)
								/*new 
								NonLocalInner.NonLocalInnerNested(
										1,1,1)*/) ;
				/*LocalInnerNestedClass.NonLocalInnerNested
				 nli = LocalInnerNested.foo(
						 new LocalInnerNestedClass.NonLocalInnerNested
						 //(
						  1,1,1));*/
				System.out.println(nli);
				
				//NonLocalInner lic = new NonLocalInner();
				//lic only orange is available
				//NonLocalInner.NonLocalInnerNested ex = lic.new NonLocalInnerNested() ;
				//ex. only red, blue and green are available
				
				//game to make you level up in different java concepts
		
				
			}
	}
