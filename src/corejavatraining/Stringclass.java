package corejavatraining;

public class Stringclass {

	public static void main(String[] args) {
		
		//String class : It is one of the pre built class in jave
		// how many ways string can declare
		// 1. string literal Mostly developer use literal
		String a = "ArunaKumari";
		// 2. creating an object of string 
		//Stringclass sc = new Stringclass();
		
        System.out.println(a.charAt(3));
 		System.out.println(a.indexOf("n"));
 		System.out.println(a.substring(0, 5));//beginning and ending index
 		System.out.println(a.toLowerCase());
 		System.out.println(a.toUpperCase());
 		System.out.println(a.trim());
 		System.out.println(a.concat("Baddipudi"));
 		//split
 		String arr1[]=a.split("m");
 		System.out.println(arr1[0]);
 		System.out.println(arr1[1]);
 		//replace
 		System.out.println(a.replace("a", "s"));
 				
 		
	}

}
