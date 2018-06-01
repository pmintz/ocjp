package nestedclasses;

	public class InnerClass {
	private inner center;
	private int radius;
	//StaticNested sn;
	public class inner/* extends StaticNested.nested*/{
		private int x;
		private int y;
		private int radius; //just seeing if i can name variable same as enclosing block
		public static final int q = 1;
		
		public inner(int x, int y){
			//this(new StaticNested());
			
			this.x = x;
			this.y = y;
			//this(1,2); constructor has to be first call.  
			//super(); constructor has to be first call.  Things like this.x or super.toString() can
			//go anywhere
		}
		
		/*public inner(StaticNested staticNested) {
			// TODO Auto-generated constructor stub
		
		}*/
		
		public inner() {
			// TODO Auto-generated constructor stub
		}
		
		public void display(){
			System.out.println("display from inner");
		}

		public String toString(){
			return "( " + x+
					", " + y +
					" )";
		}
	}
	public InnerClass(int x, int y, int r){
		center = this.new inner(x,y);
		radius = r;
	
		
	}
	public InnerClass() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "mid point: " + center +
				"\n" +
				"radius: " +
				radius;
	}

}
