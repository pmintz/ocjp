package constructors;

public class CircleConstructors {
	
	private int xPos;
	private int yPos;
	private int radius;
	

	
	public CircleConstructors(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	public  CircleConstructors(){
		this(20, 20, 10);
	}
	
	CircleConstructors(int x, int y){
		this(x, y, 10);
	}

}



