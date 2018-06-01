package runtests;
import nestedclasses.InnerClass;
import nestedclasses.InnerClass.inner;
import nestedclasses.StaticNested;

public class RunTests extends InnerClass.inner {

	public RunTests(InnerClass innerClass, int x, int y) {
		innerClass.super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNested.nested n = new
				StaticNested.nested(1,1,1);
		
		//System.out.println(n);
		
		System.out.println(
				new InnerClass(
						1, 2, 3));
		
		System.out.println(new RunTests(new InnerClass(),5,5));
		
		//InnerClass.inner ii = new InnerClass().inner(); //method inner() is undefined
		
		InnerClass.inner ii = new InnerClass().new inner();
		ii.display();
		
		//InnerClass ii = new InnerClass();
		
		//InnerClass.inner pp = ii.new inner();
	}

}
