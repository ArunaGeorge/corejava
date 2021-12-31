package oopsConceptPart2;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Mango");
		al.add("oranges");
		al.add("peaches");
		
		al.add("Baddipudi");
		al.add(10);
		al.add(12.33);
		
		System.out.println(al.size());
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		//Specific ArrayList Index
		System.out.println(al.get(2));
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//Integer ArrayList
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(50);
		System.out.println(ar);
		
		//String ArrayList
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Aruna Kumari");
		
		System.out.println(ar2);
		
		
				 

	}

}
