package collections;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ComparatorTest<E> implements Comparator<E>, Comparable{
	E a;
	E b;
	//String b;
	//String c;
	
	ComparatorTest(E a, E b){
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
	
	void print(){
		System.out.println(a);
		System.out.println(b);
	}

	@Override
	public int compare(E o1, E o2) {
		System.out.println("hello from compare");
		System.out.println("o1 = " + o1.toString());
		System.out.println("o2 = " + o2.toString());
		System.out.println('m' - 'l' );
		System.out.println(((String) o1).compareTo((String) o2));
		return ((String) o1).compareTo((String) o2);
	}
	
	public static void main(String []args){
		ComparatorTest/*<String>*/ ct = new ComparatorTest<>("Mike", "Laurie");
		
		
		/*System.out.println(*/ct.compare("Mike", "Laurie");/*);*/
		/*System.out.println(*/ct.compare("Mike", "Mike");/*);*/
		
		Iterable<String> i;
		
		List l = new ArrayList();
		l.add("Mike");
		l.add("Laurie");
		l.add("Dinesh");
		
		System.out.println("List before sort: " + l);
		
		l.sort(ct);
		
		System.out.println("List After sort: " + l);
		
		System.out.println("List printed using lambda:");
		
		l.forEach(String -> System.out.println(String));
		
		ArrayList ll = new ArrayList();
		ll.add("Hello from ArrayList");
		ll.forEach(String -> System.out.println("From arraylist: " + String));
		
		Properties p = System.getProperties();
		
		PrintStream ps = new PrintStream(System.out);
		
		
		//p.forEach( (Object, Object2)-> System.out.println(Object.toString() + " : " + Object2.toString()));
		
		//p.list(ps);
		
		//ps.print(p.toString());
		
		String frenchCounting = "un:deux:trois:quatre";
		List gmailList = Pattern.compile(":")
		.splitAsStream(frenchCounting)
		.collect(Collectors.toList());// collect is of interface Stream<T>
		//look more into Collectors.toList
		//collect is overloaded and in addition to taking Collector <? super T,A,R> collector takes
		/*Supplier<R> supplier,
        BiConsumer<R, ? super T> accumulator,
        BiConsumer<R, R> combiner*/
		gmailList.forEach(System.out::println);
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
