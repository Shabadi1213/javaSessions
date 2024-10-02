package JavaAssignmentsPractise;

public class Mulitplicationof5from1to100 {
	
	
	//Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
	
	//For loop
//	public void getMulitplicationOfFive(int a) {
//		int i = a;
//		for (i = 1; i <= a; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i);
//
//			}
//		}
//
//	}
	
	
	//While loop
	
//	public void findMultiplicationOfFive(int k) {
//	
//		int j = 1;
//		while(j<=k) {
//			if (j % 5 == 0) {
//				System.out.println(j);
//			}
//			j++;
//		}
//	
//	}
//	

	
	//do while loop
	public void MultiplyBy5(int n) {
		int i = 1;
		do {
			if(i%7==0) {
				System.out.println(i);
			}
				i++;
		}
		while(i<=n);
	}
	
	
	public static void main(String[] args) {
		
		Mulitplicationof5from1to100 obj = new Mulitplicationof5from1to100();
		//For loop
//		obj.getMulitplicationOfFive(25);
	
		//While loop
//		obj.findMultiplicationOfFive(100);
		
		
		//do while loop
		obj.MultiplyBy5(50);
		
		}
		

	}


