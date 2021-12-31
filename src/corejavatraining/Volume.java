package corejavatraining;

public class Volume {
	      static int width;
	      static int height;
	      static int length;
	      static int area;
	     
	      
	      Volume(int a, int b, int c,int d){
	    	  width = a;
	    	  height = b;
	    	 area = a*b;
	    	 length = area*c;
	    	  
	    	  
	      }  
	      
	    	  void display() {
	    		    System.out.println("This is width :" +width);
	    			System.out.println("The is height:" +height);
	    			System.out.println("Area is width * length:"+area);
	    			System.out.println("length is area m2 :"+length);
	    			System.out.println();
	    	  }
	    	  
	    	  
	    	  
	      
	      
	public static void main(String[] args) {
		Volume v = new Volume(5,6,8,5*6*8);
		
		 v.display();
		

	}

}
