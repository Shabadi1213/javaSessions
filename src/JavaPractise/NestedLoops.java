package JavaPractise;

public class NestedLoops {

	public static void main(String[] args) {

		//Printing Left angle Triangle and Pyramid

//   int n =10;
//   
//   for(int i=1;i<=n;i++) {
//	   for(int k=1;k<=n-i;k++) {
//		   System.out.print(" ");
//	   }
//	  for(int j=1;j<=i;j++) {
//		  System.out.print("*");//without space prints left angle triangle
//		  System.out.print("* ");//Adding space after * will print pyramid 
//	  }
//	  
//	  System.out.println();
//   }

		
		
		
		//Printing Right angle triangle
		
//		int n = 10;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			
//			for(int k=1;k<n-i;k++) {
//				System.out.print(" ");
//			}
//			
//			System.out.println();
//		}
		
		 
		//Printing Matrix of *'s 
		//******
		//******
		//******
		//******
		//******
		
//		int n = 10;
//		
//		for(int i=0;i<=n;i++)
//		{
//			for(int j=0;j<=n;j++) {
//				System.out.print("*" +" ");
//			}
//			System.out.println();
//		}
//		
		
		// Print matrix 
		//1 1 1 1 1 1 
		//2 2 2 2 2 2 
		//3 3 3 3 3 3 
		//4 4 4 4 4 4 
		//5 5 5 5 5 5 
		
		
//		int n =5;
//		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<=n;j++) {
//				System.out.print(i+1+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		//Print matrix 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		
//		int n =5;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=n-1;j++) {
//				System.out.print(j+1 +" ");
//			}
//			System.out.println();
//		}
//		
		
		//Print the below pattern
		//*****
		//*   *
		//*   *
		//*   *
		//*****
		
		
//		int n =5;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0||i==n-1||j==0||j==n-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//			
//			
//			
//		}
		

		//Print pattern
		//01 02 03 04 05
		//06 07 08 09 10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
//		
//		int n = 5;
//		int count =1;
//		for(int i =0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(count<10) {
//					System.out.print("0");
//				}
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}
//	
		
		
		// print pattern 
		// 01 02 03 04 05
		// 02 04 06 08 10
		// 03 06 09 12 15
		// 04 08 12 16 20
		// 05 10 15 20 25
		
//		int n =5;
//		for(int i =1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i*j<10) {
//					System.out.print("0");
//				}
//				
//				System.out.print(i*j+" ");
//			}
//			System.out.println();
//		}
		
		
		//Print below pattern
		
//		int n = 5;
//		for(int i =0;i<n;i++) {
//			int count = i+1;
//			for(int j=0;j<n;j++) {
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}
		
		
		//Print inverted left angle triangle
		//******
		 //*****
		  //****
		   //***
		    //**
		     //*
		
		int n =10;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i ;k<=n;k++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}

}