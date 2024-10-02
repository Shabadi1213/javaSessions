package StaticArrayDynamicArrays;

import java.util.Arrays;

public class StaticArrays {
	
	
	

	public static void main(String[] args) {
		
		//Int Static array
		
		int arr[] = new int [4];
		arr[0] = 20;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 50;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[1]);
		
		
		int len = arr.length;
//		System.out.println(len);
		
		boolean flag = arr.equals(arr);
//		System.out.println(flag);
		
		String s = arr.toString();
//		System.out.println(s);
		
//		System.out.println(arr.getClass());
		
		
		for(int e:arr) {
//			System.out.println(e);
		}
		
		
		// String Static array
		
		String str [] = new String [7];
		str[0] = "JAVA";
		str[1] = "Selenium";
		str[2] = "Jenkins";
		str[3] = "Maven";
		
		System.out.println(Arrays.toString(str));
		
		
		str[3] = "Dockers";
		System.out.println(str[3]);
		System.out.println(Arrays.toString(str));
		
		
		
		try {
		str[4]="BDD";
		str[5] = "AWS";
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("AIOB as occured,please check the length of array before adding the value to arry");
		}
		System.out.println(Arrays.toString(str));
		
		
		for(String s1:str) {
			System.out.println(s1);
			if(s1.equals("JAVA")){
				System.out.println("Test PASS");
			}
			
		}
		
		int len1 = str.length;
		System.out.println(len1);
		for(int i=0;i<len1;i++) {
		    System.out.println(str[i]);
			if(str[i].equals("BDD")) {
				System.out.println("BDD is a Framwork");
				break;
			}
	}

	}
}
