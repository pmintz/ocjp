package testnumber;

public class Run extends TestNumber{
	
	final int x = 1;
	
	public static void main(String[] args){
		//AbstractStaticTest.main(args);
		//System.out.println(dropLastDigit(computeTotal(Double.parseDouble(args[0]) , Double.parseDouble(args[1]))));
		Run r = new Run();
		System.out.println(r.runMethod());
		System.out.println(r.runMethod(44.23));
		System.out.println(r.runMethod(1));
		
	}
	
	strictfp static double computeTotal(double x, double y){
		return x + y;
	}
	
	static double dropLastDigit(double x){
		String number = Double.toString(x);
		number = number.substring(0, number.length() - 1);
		double droppedLast = Double.parseDouble(number);
		return droppedLast;
		
	}
	
	public String runMethod(){
		return "";
	}
	
	public int runMethod(double x){
		return (int)x;
	}
	
	private double runMethod(int x){
		return x;
	}
	
	@Override
	public void method(){
	
	}
	
}
