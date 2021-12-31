package corejavatraining;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++;//post increment
		System.out.println("This is i:"+i);
		System.out.println("This is j :"+j);
		System.out.println("********");
		
		int k = 1;
		int l = ++k;//pre increment
		System.out.println("This is k:"+k);
		System.out.println("This is l:"+l);
		System.out.println("********");
		
		int n = 2;
		int m = n--;//post decremental
		System.out.println(n);
		System.out.println("this is m :"+m);
		System.out.println("**********");
		
		int o = 2;
		int p = --o;//pre decremental
		System.out.println("This is o :" +o);
		System.out.println("this is p:"+p);
		
	}

}
