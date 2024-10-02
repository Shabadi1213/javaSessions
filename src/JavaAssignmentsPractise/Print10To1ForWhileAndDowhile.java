package JavaAssignmentsPractise;

public class Print10To1ForWhileAndDowhile {
	
	//WAP to print 10 to 1 using for, while and do-while loop
	
	//For loop
	public void getreverseOrderOfNumber(int a) {
		int k = a;
		for (k=a;k>=1;k--) {
			System.out.println(k);
			
		}
	}

	//While loop
	public void getRevrswhileloop(int b) {
		int i = b;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
	}
	
	
	//Do while loop
	public void numReversPrintDowhile(int c) {
		
		int i = c;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);
		
	}	
	
	
	public static void main(String[] args) {
		 
		Print10To1ForWhileAndDowhile obj = new Print10To1ForWhileAndDowhile();
		
		//For loop
//	  obj.getreverseOrderOfNumber(10);
		
		 //While loop
//		 obj.getRevrswhileloop(10);
		 
		 
		 //do while loop
		 obj.numReversPrintDowhile(10);

	}

}
