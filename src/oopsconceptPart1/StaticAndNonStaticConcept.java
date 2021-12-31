package oopsconceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Aruna";
	static int i=25; 

	public static void main(String[] args) {
		sum();//1.calling directly static methods
		StaticAndNonStaticConcept.sum();//2.calling static methods by class	name
	
		System.out.println(i);//1.calling static variables
		System.out.println(StaticAndNonStaticConcept.i);//2.calling by class name
		
		//calling non static method and non static global variable
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendmail();
	}
	
	public void sendmail() {
		System.out.println("non static method");
	}
	
	public static void sum()
	{
		System.out.println("static method");
	}
}
