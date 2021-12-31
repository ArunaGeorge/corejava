package corejavatraining;

public class Area {
	double Pi;
	double radius;
	double square;
	double area;
	
	Area(double i, double j,double s,  double a){
		Pi=i;
		radius = j;
		square =s;
		area =j*s*i;
		
		
		
		
	}
	
	public void display()
	{
		System.out.println("Pi value is " + Pi);
		System.out.println("Radius Value is "+ radius);
		System.out.println("Square is : "+ square);
		System.out.println("Area Value Is " + area);
	}

	public static void main(String[] args) {
		
		Area a= new Area(3.14,50,50,50*50*3.14);
		a.display();
		Area a1 = new Area(3.14,15,15,15*15*3.14);
		a1.display();
		/*System.out.println(a.Pi);
		System.out.println(a.radius);
		System.out.println(a.area);*/
	}

}
