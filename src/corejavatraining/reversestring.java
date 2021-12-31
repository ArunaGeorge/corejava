package corejavatraining;

public class reversestring {

	public static void main(String[] args) {
		
		String s= "ArunaKumari";
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
			//System.out.println(a);
			
		}
		System.out.println(a);
		if(s==a)
		{
			
		}
	}

}
