package concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class COWList {
	public static void main(String []args) {
		List<String> aList = new CopyOnWriteArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator listIter = aList.iterator();
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
			aList.add("four");
		}
		
		Iterator listIter2 = aList.iterator();
		while(listIter2.hasNext()){
			System.out.println(listIter2.next());
		}
	}
}
