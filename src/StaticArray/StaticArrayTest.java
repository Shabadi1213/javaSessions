package StaticArray;

import java.util.Arrays;

public class StaticArrayTest {

	public static void main(String[] args) {
		
		//How to copy Array
		
		int original [] = {10,20,30,50,60};
		int copyof []= {};
//		System.out.println(Arrays.toString(original));
//		
//		int copyof [] = Arrays.copyOf(original, 9);
//		System.out.println(Arrays.toString(copyof));
		
		for(int i=0;i<original.length;i++) {
			copyof = original.clone();
			
			System.out.println(copyof[i]);
	}
		
		
		
		
		
		
		
	}
}
