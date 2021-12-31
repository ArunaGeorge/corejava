package oopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism or compile time polymorphism
		Bmw bm = new Bmw();
		bm.start();
		bm.stop();
		bm.refuel();
		bm.theftsafety();
		
		System.out.println("********");
		
		Car ca = new Car();
		ca.start();
		ca.stop();
		ca.refuel();
		
		System.out.println("*********");
		
		//Car ca2 = new Bmw();//child class object can be referred by parent class reference variable
		//is called dynamic polymorphism or runtime polymorphism
	
		//Top Casting
		Car ca2=new Bmw();
		ca2.refuel();
		ca2.start();
		ca2.stop();
		//down Casting
	//	Bmw b1 =(Bmw)new Car();//ClassCastException
		
	}
	

}
