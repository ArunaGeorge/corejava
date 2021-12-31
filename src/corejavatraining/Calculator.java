package corejavatraining;

public class Calculator {
	
	public int add(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
		return c;
		}
	
	public int multilplication(int m, int n) {
		int o = m*n;
		return o;
						
	}
	
	public int division(int k, int l) {
		
		int p = k / l;
		return p;
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10,20);
		
		int c=cal.multilplication(15,10);
		System.out.println(c);
		
		int c1=cal.division(25, 5);
		System.out.println(c1);
		//Predefined java classes method
		double num = Math.random()*5;
		System.out.println(num);
	}

}
