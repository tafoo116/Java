package review_all;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap_Hashset {
	public static void main(String[] args) {

		HashSet<String> name = new HashSet<String>();
		name.add("tom");
		name.add("jami");
		name.add("sam");
		name.add("sam");
		System.out.println(name);
		System.out.println(name.contains("tom")); // to see that we have the value.
//		to execute all
		for (String I : name) {
			System.out.println(I);
		}
		System.out.println(name.size());
		name.remove("tom");
		name.clear();
		System.out.println(name);

		System.out.println("-------------------------------");

		HashMap<Integer, String> pre = new HashMap<Integer, String>();

		pre.put(1, "firstname");
		pre.put(2, "lastname");
		pre.put(3, "Medname");
		pre.put(4, "Address");
		pre.put(5, "Zipcode");

		System.out.println(pre.get(1));
		System.out.println(pre.keySet()); // to get all the key in a hashmap
		System.out.println(pre.values()); // to get all the value in a hashmap
		System.out.println(pre);
		System.out.println(pre.containsKey(3)); // check to see do we have the key
		System.out.println(pre.containsValue("Medname")); // chect to see do we have the value
		
//		to print all the key and value
		for (Integer o : pre.keySet()) {
			System.out.println(o + " " + pre.get(o));
		}
//		to Store duplicate value 
//		cause we can  not store dublcate key in a hashmap

		HashMap<Integer, HashMap<String, String>> first = new HashMap<Integer, HashMap<String, String>>();

		first.put(1, new HashMap<String, String>());

		first.get(1).put(null, null); // call the metode

		first.get(1).put("firstname", "Tariq ");
		first.get(1).put("Lastname", "Fushanji");
		first.put(2, new HashMap<String, String>());
		first.get(2).put("firstname", "tom");
		first.get(2).put("Lastname", "tomy");

		System.out.println(first);
		
		

	}
}