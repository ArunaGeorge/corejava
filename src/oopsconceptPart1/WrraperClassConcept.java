package oopsconceptPart1;



public class WrraperClassConcept {

	public static void main(String[] args) {
		//Data conversion String to Int
		String s  = "100";
		System.out.println(s+20);
		
		//Integer, Double, Boolean
		
		String n = "100";
		int m = Integer.parseInt(n);
		System.out.println(m);
		
		//Double
		String x = "12.33";
		Double d = Double.parseDouble(x);
		System.out.println(d);
		
		//Boolean
		String y = "true";
		Boolean b = Boolean.parseBoolean(y);
		System.out.println(b);

		//int to string conversion
		
		int t = 200;
		System.out.println(t+20);
		
		String s1 = String.valueOf(t);
		System.out.println(s1);
		
		String u = "100A";
		int i = Integer.parseInt(u);//NumberFormatException----For input string: "100A"
		System.out.println(i);
	}

}
