package corejavatraining;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String s[][] = new String [3][4];
		
		s[0][0]="Aruna";
		s[0][1]="Kumari";
		s[0][2]="Baddipudi";
		s[0][3]="George";
		
		s[1][0]="Aruna1";
		s[1][1]="Kumari1";
		s[1][2]="Baddipudi1";
		s[1][3]="George1";
		
		s[2][0]="Aruna2";
		s[2][1]="Kumari2";
		s[2][2]="Baddipudi2";
		s[2][3]="George2";
		
		System.out.println("This is column:"+s[0].length);
		System.out.println(s[0][0]);
		
		//Print all the values of 2 dimensional array use 2 FOR LOOPS
		//ROW - 0, COL - 0 TO 4
		//ROW - 1, COL - 0 TO 4
		//ROW - 2,COL - 0 TO 4
		for(int row =0; row<s.length;row++)
		{
			for(int col=0;col<s[0].length;col++)
			System.out.println(s[row][col]);
		}

	}

}
