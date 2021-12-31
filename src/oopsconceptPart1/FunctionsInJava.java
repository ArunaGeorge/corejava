package oopsconceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		//Main method is void ---->never returns a value
		
		 FunctionsInJava obj = new  FunctionsInJava();
		//obj is the reference variable, referring to this object
		 //After creating the object, the copy of the Non Static Methods will be given to this object 
		 
		 obj.test();
		 
		 int d=obj.pqr();
		 System.out.println(d);
		 
		 String s1=obj.st();
		 System.out.println(s1);
		 
		 int div= obj.division(30, 10);
		 System.out.println(div);
		
		
	}
	//non static methods
	//void doesn't return any value
	//return type void
	//No input No output
	public void test() {
		System.out.println("test method");
	}
	//No input some output
	public int pqr() {
		System.out.println("pqr Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	//No input some output
	public String st() {
		System.out.println("String Method");
		String s = "Aruna";
		return s;
	}
	//input parameters/arguments
	public int division(int x, int y) {
		System.out.println("parameters method");
		int z = x/y;
		return z;
	}
}
