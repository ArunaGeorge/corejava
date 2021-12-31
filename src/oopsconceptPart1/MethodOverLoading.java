package oopsconceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		//to call non static methods create an object
		
		MethodOverLoading obj = new MethodOverLoading ();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(12.33);
		
	}
	
	//main method can be overload with different arguments
	public static void main(int a) {
		
	}
	public static void main(int b, int c) {
		
	}
	
	//you can not creat a method inside a method
	//same method name same params not allowed
	//method overloading ----same method name with different params/arguments and data types in the same class
	public void sum() {
		System.out.println("sum method --- no params");
	}
	public void sum(double d) {
		System.out.println("sum method with different data type");
		System.out.println(d);
	}
	
	public void sum(int i) {
		System.out.println("sum Method with 1 input param");
		System.out.println(i);
	}
	
	public void sum(int a, int b) {
		System.out.println("sum method -----2input params");
		System.out.println(a+b);
	}

}
