package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("Puja");
		set.add("Sudha");
		set.add("Aklesh");
		set.add("Aklesh");
		
		for(String s :set) {
			System.out.println(s);
		}
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
