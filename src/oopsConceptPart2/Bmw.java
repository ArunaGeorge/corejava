package oopsConceptPart2;

public class Bmw extends Car {//has a relationship
	
	//When same methods present in parent class and child class with same arguments
	//is called method overriding
	
	public void start()//method overriding
	{
		System.out.println("BMW----Start");
	}
		
	public void theftsafety() {
		System.out.println("BMW ----theftsafety");
	}

	
}
