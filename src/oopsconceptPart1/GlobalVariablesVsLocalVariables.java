package oopsconceptPart1;

public class GlobalVariablesVsLocalVariables {

	//Global variables or Class Variables
	String name = "Tom";
	int age = 25;
	public static void main(String[] args) {
		
		int i = 10;//Local Variable to the main method
		System.out.println(i);
		
		//to call Global variables or Class Variables create object
		
		GlobalVariablesVsLocalVariables obj = new GlobalVariablesVsLocalVariables();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();
	}

		public void sum() {//Local Variables to sum method
			
			int i =15;
			int j = 20;
			System.out.println(i);
			System.out.println(j);
		}
}
