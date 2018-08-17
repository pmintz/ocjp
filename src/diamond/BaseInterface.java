package diamond;

public interface BaseInterface {
	
	Diamond d = new Diamond();

	public static Diamond foo2(){
		System.out.println("BaseInterface foo");
		return new Diamond();
		
	}

	
}
