package JavaPractise;

public class ReverseString {
	
	public static void reverseString(String st) {
		String arr [] = st.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	
	
	public static String reverse(String str) {
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
		    rev = rev+str.charAt(i);
			}
				return rev;
			}
	
		
	public static void main(String[] args) {
		
		reverseString("SELENIUM WITH JAVA");
		
		System.out.println("===========================");
		
		String s = reverse("SELENIUM WITH JAVA");
		System.out.println(s);
}
	
}
