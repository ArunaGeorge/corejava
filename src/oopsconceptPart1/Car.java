package oopsconceptPart1;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		//new car() is an object of car class
		//a,b,c are a reference variables for the object
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		//shifting objects
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		b.wheel=20;
		System.out.println(a.mod);
		System.out.println(b.wheel);
				
		
		
	}

}
