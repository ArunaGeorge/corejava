package corejavatraining;

public class Class1 {
	static int a = 4;
	public void getdata() {
		System.out.println("Iam in method");
	}

	public static void main(String[] args) {
		Class1 cs = new Class1();
		cs.getdata();
		//created Class2 object to call setData() method in the Class1
		Class2 cl=new Class2();
		cl.setData();
		System.out.println(a);
		System.out.println("Hello World");
		System.out.print("false");
		}

}
