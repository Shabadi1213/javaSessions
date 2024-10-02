package StringManipulations;

import java.util.Arrays;

public class ReverseString {
	
	public static String reverse(String str) {
		int len = str.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		return rev;
	}
//		
	
	public static void revstring(String s) {
	String arr[] = s.split(" ");
//	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<=arr.length-1;i++){
		for(int j=arr[i].length()-1;j>=0;j--) {
			System.out.print(arr[i].charAt(j));
		}
		System.out.print(" ");
	}

}
	

	public static void main(String[] args) {
		
		String st = "SELENIUM WITH JAVA";
		String s = reverse(st);
		System.out.println(s);
		
		
		String str = "SELENIUM WITH JAVA";
		revstring(str);
		
		

	}

}
