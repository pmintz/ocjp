package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pangram = 
				"the quick brown fox " +
		"jumps over the lazy dog";
		
		Set<String> aToZ = new TreeSet<String>();
		//List<String> list = new ArrayList<>();
		String [] s;
		s = pangram.split(" ");
		for(String word: s)
			aToZ.add(word);
		System.out.println(pangram);
		System.out.println(aToZ);
	}

}
