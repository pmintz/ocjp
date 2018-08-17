package chap2.immutableobjects;

public final class ImmutableCircle {
	private final MutableClassPoint center;
	private final int radius;
	public ImmutableCircle(int x, int y, int r) {
	center = new MutableClassPoint(x, y);
	radius = r;
	}
	public String toString() {
	return "center: " + center + " and radius = " + radius;
	}
	public int getRadius() {
	return radius;
	}
	public MutableClassPoint getCenter() {
	// return a copy of the object to avoid
	// the value of center changed from code outside the class
	return new MutableClassPoint(center.getX(), center.getY());
	}
	public static void main(String []s) {
	System.out.println(new ImmutableCircle(10, 10, 20));
	ImmutableCircle im1 = new ImmutableCircle(1,1,1);
	ImmutableCircle im2 = new ImmutableCircle(2,2,2);
	System.out.println("im1: " + im1);
	System.out.println("im2: " + im2);
	MutableClassPoint mcp = im1.center;//still referring to same object
	//The idea here is that because the constructor initialize the
	//fields, you are forced to create a new object in an attempt
	//to change the value of the mutable object.  Also, with only 
	//have a getter you cannot change the value set by the constructor.
	}

}
