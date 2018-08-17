package diamond;

import java.util.Comparator;

public class Diamond extends BaseClass implements BaseInterface, Comparator, Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.foo2();
		new Diamond().foo();
		BaseInterface.foo2();
		foo3();
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//Comparator
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//Comparable
		return 0;
	}
	
	public void method(int a){
		System.out.println(a);
	}
	
	public String method(){
		return "";
	}
	
	public String method(String a){
		return a;
	}
	
	public Diamond foo2() {
		// TODO Auto-generated method stub
		return BaseInterface.foo2();
	}

}
