package collections;

import java.util.ArrayList;
import java.util.Collection;



public class Test {
	int x;
	String name;
	
	Test(String s){
		name = s;
	}
	
	/*static*/ ArrayList getArrayList(final ArrayList al, Test t) {
		// note the use of anonymous inner classes here
		// -- specifically, there is no name for the class and we construct
		// and use the class "on the fly" in the return statement!
				//NonLocalInner nl = new NonLocalInner();
				 
				return  new ArrayList() {
					@Override
					public String toString(){
						return "ArrayList Information" +"\n" 
								+ " Class Name: " + al.getClass().getName() + "\n" +
								" Simple Name: " + al.getClass().getSimpleName() + "\n"+
								" Canonical Name: " + al.getClass().getCanonicalName() + "\n"+
								" Component Type: " + al.getClass().getComponentType() + "\n"+
								" Object Hashcode: " + al.hashCode() + "\n"+
								" Object Location: " + al.toString() + "\n"+
								" Test Object Information:" + "\n" +
								" Object Name: " + name + "\n" +
								" Object location: " + t + "\n" +
								" Value of X is: " + x;
					}
				};
		}
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test("t1");
		t1.setX(1);
		Test t2 = new Test("t2");
		t2.setX(2);
		
		ArrayList box1 = t1.getArrayList(new ArrayList(), t1);
		ArrayList box2 = t2.getArrayList(new  ArrayList(), t2);
		
		box1.add(t1);
		box1.add(t2);
		box2.addAll(box1);
		
		System.out.println(box1);
		System.out.println(box2);
		
		System.out.println();
		System.out.println();
		
		ArrayList al = new ArrayList();
		
		System.out.println("Name: " + al.getClass().getName());
		System.out.println("Simple Name: " + al.getClass().getSimpleName());
		System.out.println("Canonical Name: " + al.getClass().getCanonicalName());
		System.out.println("Component Type: " + al.getClass().getComponentType());
		System.out.println("Component Type: " + al.hashCode());
		
		box2.removeAll(box1);
	

	}

}
