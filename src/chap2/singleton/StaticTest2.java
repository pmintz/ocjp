package chap2.singleton;

public class StaticTest2 {

	static int y = 1;
	
public static StaticTest st2 = new StaticTest();
	
	public static StaticTest getInstance() {
		return StaticTest2.st2;
	}
}
