package corejavatraining;

public class Concatination {

	public static void main(String[] args) {
		int i = 100;
		int k = 200;
		System.out.println(i+k);//300
		
		String s="Hello";
		String j = "World";
		System.out.println(s+j);//HelloWorld
		
		System.out.println(i+k+s+j);//left to right execution
									//300HelloWorld
		
		System.out.println(s+j+i+k);//Left to right execution
									//HelloWorld100200
		System.out.println("this is k value:"+k);//+ is concatination
		System.out.println("This is i and k value:"+(i+k));
		System.out.println("These are:" +(i+k)+(s+j));//left to right execution
													//These are: 300HelloWorld
}
}