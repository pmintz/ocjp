package graphicshape;

import java.util.HashSet;
import java.util.Set;

class Shape {
	
	protected int color;
	
	Shape(){
		color = 5;
	}
	
	public static void main(String [] args){
		Shape s = new Shape();
		Shape q = new Shape();
		
		System.out.println(s.equals(q));
		HashSet<Shape> hs = new HashSet();
		hs.add(s);
		System.out.println(hs.contains(new Shape()));
	}
		
	@Override
	public boolean equals(Object arg){
		if(arg == null) return false;
		if(this == arg)return true;
		if(arg instanceof Shape){
			Shape that = (Shape) arg;
			if((this.color == that.color)){
				return true;
		}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return (7 * color)^(11 * color)^(53 * color);
	}

}

