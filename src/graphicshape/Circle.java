package graphicshape;

public class Circle extends Shape{
	
	private int radius; // private field
	private int color;
	
	public Circle(){
		color = 4;
		this.color = super.color;
		//super(); compiler error
	}
	public void area() { // public method
	// access to private field radius inside the class:
	System.out.println("area: " + 3.14 * radius * radius);
	}
	// The fillColor method has default access
	void fillColor() {
	//access to protected field, in subclass:
	System.out.println("color: " + color);
	}
	
	public static void main(String []args){
		Circle c = new Circle();
		c.area();
		System.out.println(new Circle().color);
	}

}
