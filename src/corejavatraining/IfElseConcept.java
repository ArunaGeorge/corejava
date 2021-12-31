package corejavatraining;

public class IfElseConcept {

	public static void main(String[] args) {
		
		//Comparision Operators are
		//< > <= >= == !=
		
		int a =20;
		int b = 30;
		
		if(b>a) {
			System.out.println("b is greater than a");
			
		}else {
			System.out.println("a is greater than b");
		}
		
		int c = 40;
		int d = 50;
		
		if(c==d)
		{
			System.out.println("c and d equal");
		}else {
			System.out.println("c and d not equal");
		}
		
		int e = 20;
		int f = 20;
		
		if(e!=f) {
			System.out.println("e and f not equal");
		}else {
			System.out.println("e and f are equal");
		}
		//Write a logic to find out which number is highest
		int a1=100;
		int b1=400;
		int c1=300;
		
		//nested IF
		
		if(a1>b1 & a1>c1) {//false & true = false
			System.out.println("a Is greater");
			
		}else if(b1>c1){
			System.out.println("b is greater");
			
		}else {
			System.out.println("c is greater");
		}
		

	}

}
