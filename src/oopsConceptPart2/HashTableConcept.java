package oopsConceptPart2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		ht.put(1, 100);
		ht.put(2,300);
		ht.put(3,400);
		
		ht.put("a","Nirmala");
		ht.put("b","kumari");
		ht.put(4,12.33);
		ht.remove(3);
		System.out.println(ht.get("a"));
		System.out.println(ht.size());
		System.out.println(ht.get(4));
		System.out.println(ht.get(3));
		
		Hashtable<Integer, String>  ht1 = new Hashtable<Integer, String>(); 
		
		ht1.put(5, "George");
		System.out.println(ht1.get(5));
		
		
		
	}

}
