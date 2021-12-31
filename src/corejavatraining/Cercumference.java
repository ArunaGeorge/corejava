package corejavatraining;

public class Cercumference {
	double pi;
	double dis;
	double cir;
	Cercumference(double i,double j,double c){
		pi=i;
		dis=j;
		cir=j*i;
		
	} 
	void display() {
		
		System.out.println("Pi value is "+pi);
		System.out.println("Distance Value is" + dis);
		System.out.println("Circumference Value is "+cir);
		
	}
	
	

	public static void main(String[] args) {
		Cercumference c = new Cercumference(15,3.14,15*3.14);
		c.display();
		
		

	}

}
