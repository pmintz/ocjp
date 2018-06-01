package bitwise;

public class BitWise {
	final String a;
			
	{
		System.out.println("Hello from code block 1");
	}
	
	BitWise(){
		System.out.println("Hello from constructor");
		a = "b";
		meth("b");
	}
	
			@Override
			public String toString(){
				return "Hello from Bitwise";
			}
			
			{
				System.out.println("Hello from code block 2");
			}
			
			public String meth(final String a){
				//this.a = a; a has to be initialized from constructor and not from a method call
				return a;
			}

		   public static void main(String args[]) {
			  BitWise z = new BitWise();
		      int a = 60;	/* 60 = 0011 1100 */
		      int b = 13;	/* 13 = 0000 1101 */
		      int c = 0;

		      c = a & b;        /* 12 = 0000 1100 */
		      System.out.println("a & b = " + c );

		      c = a | b;        /* 61 = 0011 1101 */
		      System.out.println("a | b = " + c );

		      c = a ^ b;        /* 49 = 0011 0001 */
		      System.out.println("a ^ b = " + c );

		      c = ~a;           /*-61 = 1100 0011 */
		      System.out.println("~a = " + c );

		      c = a << 2;       /* 240 = 1111 0000 */
		      System.out.println("a << 2 = " + c );

		      c = a >> 2;       /* 15 = 1111 */
		      System.out.println("a >> 2  = " + c );

		      c = a >>> 2;      /* 15 = 0000 1111 */
		      System.out.println("a >>> 2 = " + c );
		      
		      BitWise [] arr = new BitWise[3];
		      arr[0] =  z;
		      arr[2] = z;
		      
		      System.out.println(arr[0].toString() + " \\\\ " + arr[1] +
		    		  " \\\\ " + arr[2].toString());
		      
		      
		   }
		}


