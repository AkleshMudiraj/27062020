package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<>();
		
		// String = generic types
		
		list.add("Aklesh");
		list.add("Anand");
		list.add("Aklesh");

		for(String s :list) {
			System.out.println(s);
		}
	}

}
