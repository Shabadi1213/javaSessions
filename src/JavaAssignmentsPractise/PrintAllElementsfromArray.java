package JavaAssignmentsPractise;

public class PrintAllElementsfromArray {

	public static void main(String[] args) {
	
		//Print all the elements of this array using for, for each, while and do-while loop:

         int p[] = {1,3,4,5,22,56,89,90};
         
         //For loop
         
         for(int i = 0;i<=p.length-1;i++) {
        	 System.out.println(p[i]);
         }

         System.out.println("===========================for Each loop===========");
         for(int e:p) {
        	 System.out.println(e);
         }
         
         System.out.println("===========================While loop===========");
         int i = 0;
         while(i<=p.length-1) {
        	 System.out.println(p[i]);
        	 i++;
         }
         
         System.out.println("===========================do-While loop===========");
         int j = 0;
         do {
        	 System.out.println(p[j]);
        	 j++;
         }
         while(j<=p.length-1);
         
         
         
	}

}
