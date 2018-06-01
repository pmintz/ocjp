package nestedclasses;

public class StaticNested { //can only be public, abstract or final
	int a = 1;
	//nested n = new nested();
	/*void metha(){
		n.nestedmeth();
		a = n.green;
	}*/
	static void methb(){
		System.out.println(
				"static"
				+ "methb");
	}
	
	public static class nested{
		private int red, green, blue;
		//static int orange; nested class has to be static  for a static variable.  Or this variable
		//can be static final.
		//private int b = a; //change a to static or remove static modifier for class nested
		//Non local (not inside method)
		//static
		//can define a 
		//static class(or interface)
		//inside another class(or interface)
		//don't have to use static
		//keyword with nested interface
		//since it is implicitly static
		public nested(){
			this(0,0,0);
			methb();
			//a = 1; cannot make a static reference to a non static field
		}
		public nested(int red, int green,
				int blue){
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		public String toString(){
			return "red: " + red 
					+ "\n" +
					"green: " + green
					+ "\n" +
					"blue: " + blue;
		}
		public void nestedmeth(){
			System.out.println(
					"nested meth");
		}
	}
	

}
