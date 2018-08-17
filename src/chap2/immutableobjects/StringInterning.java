package chap2.immutableobjects;

public class StringInterning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("string");
		String str2 = new String("string");
		String str3 = str1.intern();
		
		System.out.println("str1 == str2: " + (str1==str2));
		System.out.println("str1 == str3: " + (str1==str3));
		System.out.println("str3: " + str3);
		System.out.println("str1.intern() == str2.intern(): " + (str1.intern()==str2.intern()));

	}

}
