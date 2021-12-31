package edurekaJavaPrerequisites;

public class Arrays {
	int a[]= {00,02,03};
	String name[] = {"aruna","nirmala","vijaya"};
	double salary[] = {5000,6000,7000};
	int i,j,k;
	
	public void display()
	{
			
		for(i=0;i<3;i++) {
			
			System.out.println(a[i]);
			
		}
		System.out.println("---------");
		for (j=0;j<3;j++) {
			System.out.println(name[j] + "   ");
		}
		System.out.println("----------");
		for (k=0;k<3;k++) {
			System.out.println(salary[k]);
		}
		
	}

	public static void main(String[] args) {
		
		Arrays array = new Arrays();
		array.display();
		
		
		}
	}


