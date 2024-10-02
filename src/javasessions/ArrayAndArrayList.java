package javasessions;

import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		// Creating an Array with size 5
		
		int i[] = new int[5];
		
		//Assigning values to Array
		
		i[0] = 10;
		i[1] = 100;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		int len = i.length;
		for(int j=0;j<=len-1;j++) {
		System.out.println(i[j]);

	}   
     
		System.out.println(Arrays.toString(i));
}
}