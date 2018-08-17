package testnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNumber {
	// take an array of numbers and sum them up
	int i = 1;
	
	{
	System.out.println("non static block 1");
	i = 2;
	}
	
	static {
		int t = 5;
		System.out.println("static block1");
		
		{
			System.out.println("static blockafter1");
			t=6;
		}
	}
	
	
	{
	System.out.println("non static block 2");
	}
	
	static {
		System.out.println("static block2");
	}
	public static double sum(Number []nums) {
	double sum = 0.0;
	for(Number num : nums) {
	System.out.println(num);
	sum += num.doubleValue();
	}
	
	return sum;
	}
	
	protected void method(){
		int x = 1;
		
	}
	public static void main(String []s) {
		//List<Number> num = new ArrayList<Integer>(); Cannot be integer
		int x = 2;
		
		{
			System.out.println("non static block 3");
			}
			
	// create a Number array
	Number []nums = new Number[4];
	// assign derived class objects
	nums[0] = new Byte((byte)10);
	nums[1] = new Integer(10);
	nums[2] = new Float(10.0f);
	nums[3] = new Double(10.0f);
	// pass the Number array to sum and print the result
	System.out.println("The sum of numbers is: " + sum(nums));
	System.out.println("Zero printed as a double: "  + 
	new TestNumber().printZero());
	
	{
		System.out.println("non static block 4");
		x = 6;
		System.out.println(x);

		}
	}
	double printZero(){
		return 0;
	}
	
	
	}

class Base {}
class DeriOne extends Base {}
class DeriTwo extends Base {}
class ArrayStore {
public static void main(String []args) {
Base [] baseArr = new DeriOne[3];
baseArr[0] = new DeriOne();
//baseArr[2] = new DeriTwo(); ArrayStore exception
System.out.println(baseArr.length);
Arrays.stream(baseArr).forEach(System.out::println);
Run r = new Run();
String x = "x";
}
}