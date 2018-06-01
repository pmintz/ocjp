package immutableobjects;

public class MutableClassPoint {
	
	private int xPos, yPos;
	public MutableClassPoint(int x, int y) {
	xPos = x;
	yPos = y;
	}
	public String toString() {
	return "x = " + xPos + ", y = " + yPos;
	}
	
	int getX() { return xPos; }
	int getY() { return yPos; }

}
