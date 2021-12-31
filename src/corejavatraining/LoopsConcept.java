package corejavatraining;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//dis advantage of while loop it generates infinite loop if you don't give incremental/decremental
		int i=1;//initialization
		while(i<=10) {//condition
			System.out.println(i);
			i=i+1;//incremental/decremental
		}
		
		//j++ means j=j+1
		//for loop
		for(int j=1;j<=5;j++) {
			System.out.println(j);
			
		}
		//k-- means k=k-1
		//10,9,8,7,6,5,4,3,2,1,0
		for(int k =10;k<=0;k--) {
			System.out.println(k);
		}
		//printing positive and negative numbers
		for(int l =10; l>=-10;l--) {
			
			System.out.println(l);
		}
			

	}

}
