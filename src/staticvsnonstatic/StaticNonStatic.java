package staticvsnonstatic;

public class StaticNonStatic {
	
	String x;
	static String y;
	
	void methoda(){
		methodb();//can access static from nonstatic
		String p = x;
		String q = y;
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static void methodb(){
		//methoda();cannot access nonstatic from static
		//String p = x;cannot access nonstatic fron static
		String q = y;
		//System.out.println(x);cannot access nonstatic from static
		System.out.println(y);
	}

	public static void main(String[] args) {
		StaticNonStatic s =  new StaticNonStatic();
		System.out.println(s.x);//cannot access x directly
		System.out.println(y);
		
		s.methoda();//cannot access methoda directly
		
		methodb();

	}

}
