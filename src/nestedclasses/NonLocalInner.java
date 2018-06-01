package nestedclasses;

abstract class NonLocalInner {
	
	public int orange;
	NonLocalInner(){}
	public static class NonLocalInnerNested{
		private int red, green, blue;
		
		public NonLocalInnerNested(){
			super();
			//this(0,0,0);
			//red = 1;
		}
		public NonLocalInnerNested(
				int red, int green,
				int blue){
			super();
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		public String toString(){
			//red = 2;
			return ""
					+ "red= "
					+ red +
					" | green= "
					+ green +
					" | blue= "
					+ blue;
		}
		public void print(){
			System.out.println("Printed using super");
		}
	
	}

}



