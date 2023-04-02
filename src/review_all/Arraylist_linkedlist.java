package review_all;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist_linkedlist {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("lost");
		name.add("open");
		name.add("sun");
		System.out.println(name);
		System.out.println(name.contains("lost"));
		System.out.println(name.get(0));
		name.set(2, "lov"); // change the value
		System.out.println(name);

		LinkedList<String> sors = new LinkedList<String>();
		
		sors.add("s");
		sors.add("e");
		sors.add("r");
		System.out.println(sors);
//		and same as arraylist
		
	}

}
