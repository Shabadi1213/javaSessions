package JavaAssignmentsPractise;

import java.util.Arrays;

public class CreateStaticArray2 {

	public static void main(String[] args) {
		
		Object k[] = new Object[4];
		k[0] = "Sachin Tendulkar";
		k[1] = 45;
		k[2] = "Team India";
		k[3] = 5000;
		
		System.out.println(Arrays.toString(k));
		System.out.println("==================Break====================");
		
		//For each loop
		
		for(Object e:k) {
			System.out.println(e);
		}
		
		System.out.println("==================Break====================");
		
		//For loop
		
		for (int i = 0;i<k.length;i++) {
			System.out.println(k[i]);
		}
		
				
		}
			
	}


