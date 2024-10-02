package JavaAssignmentsPractise;

public class PrintArrayElementsReveresOrder {

	public static void main(String[] args) {
		
		
		//Print all the elements of this array in reverse order using for, for each, while and do-while loop:

		int p[] = {1,3,4,5,22,56,89,90};
		
		//For loop
		for(int i =p.length-1;i>=0;i--) {
			System.out.println(p[i]);
		}
		
		System.out.println("=================For each loop====================");
		
		int len = p.length-1;
		for(int e:p) {
			e = len;
			System.out.println(p[e]);
			len--;
		}
		
		
		System.out.println("=================While loop====================");
		int j=p.length-1;
		while(j>=1) {
			System.out.println(p[j]);
			j--;
			
		}
		
		System.out.println("=================do While loop====================");
		
		int k = p.length-1;//7
		do {
			System.out.println(p[k]);//p[7] =90
			k--;
		}
		while(k>=1);
		
		

	}

}
