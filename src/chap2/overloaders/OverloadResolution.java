package chap2.overloaders;

public class OverloadResolution {
	public static void aMethod (int val) { System.out.println ("int"); }
	public static void aMethod (short val) { System.out.println ("short"); }
	//public static void aMethod (Integer val) { System.out.println ("integer"); }
	public static void aMethod (String val) { System.out.println ("String"); }
	public static void aMethod (Object val) { System.out.println ("object"); }
	public static void aMethod (Number val) { System.out.println ("number"); }
	public static void main(String[] args) {
		byte b = 9;
		aMethod(b); // first call
		aMethod(9); // second call
		//Number i = 9;
		Integer i = 9;
		aMethod(i); // third call
		aMethod("9"); // fourth call
		Object o = new Object();
		System.out.println(o.hashCode());
		System.out.println(o.toString());
	}

}
