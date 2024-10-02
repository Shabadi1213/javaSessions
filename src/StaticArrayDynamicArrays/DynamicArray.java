package StaticArrayDynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {

	public static void main(String[] args) {

      //================ArrayList===================
		
		ArrayList<Integer> intarr = new ArrayList<Integer>();//Creating new Integer ArrayList
		
		//Adding values to ArraList
		
		intarr.add(20);
		intarr.add(30);
		intarr.add(40);
		intarr.add(50);
		intarr.add(30);
		intarr.add(100);
		
		System.out.println(intarr);
		
		//Update the value of specific Index in ArrayList
		
		intarr.add(2, null);
//		System.out.println(intarr);
		
		
		ArrayList<Integer> intarr1 = new ArrayList<Integer>();
		System.out.println(intarr1);
		
		boolean ar = intarr1.addAll(intarr);
		System.out.println(intarr1);
		
		intarr1.addAll(5, intarr);
		
		System.out.println(intarr1);
		
		System.out.println(intarr1.get(11));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
