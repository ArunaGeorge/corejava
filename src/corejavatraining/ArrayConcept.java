package corejavatraining;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Lowest boundry index is = 0
		//Upper bound index is n-1 (n is size of array)
		//Advantage we can use different values in single variable
		//disadvantage we can store similar data type values to over come this problem we use OBJECT ARRAY
		//and array size is fixed called static array to over come this problem we use COLLECTION, ARRAYLIST,HASHTABLE
		int i[] = new int [4];
		i[0]=10;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//out of bound exception
		
		//to know size of array/Length of array
		System.out.println(i.length);
		
		//print all the values of array use for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//double array
		double d [] = new double [3];
		d [0] = 10.01;
		d[1] = 20.01;
		d[2] = 30.01;
		System.out.println(d[0]);
		System.out.println(d[2]);
		System.err.println(d[1]);
		
		//char array
		
		char c [] = new char [2];
		c [0] = 'A';
		c [1] = 'G';
		System.out.println(c[0]);
		
		//String array
		
		String s [] = new String[2];
		s [0]="Aruna";
		s[1] ="Kumari";
		
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		//OBJECT ARRAY
		//object is a class used to store different data types values
		Object ob [] = new Object [6];
		ob[0]="Aruna";
		ob[1]=53;
		ob[2]=12.33;
		ob[3]="1/1/74";
		ob[4]='f';
		ob[5]="US";
		System.out.println(ob[3]);
		for(int k =0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
	
	}
	

}
