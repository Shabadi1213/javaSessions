package StringManipulations;



public class StringBuilderAndStringBuffer {
	
	public String reverseString(String st){
		
		//Null Check
		
		if(st == null) {
			throw new RuntimeException("Value can not be null");
		}
		
		// Length Check should be 1 or 0
		if(st.length()==1 || st.length()==0) {
			return st;
		}
		
		int len = st.length();
		String rev = "";
	
		for(int i=len-1;i>=0;i--) {
			rev = rev+st.charAt(i);
		}
		return rev;
		}

	public static void main(String[] args) {
		
		//String Builder-JDK 1.4
//		StringBuilder sb = new StringBuilder("Selenium");// Will create 1 object in Heap memory
//		
//		sb.append(" Automation");
//		System.out.println(sb);
		
		
		//String Buffer- JDK 1.0:Thread safe
//		StringBuffer sbf = new StringBuffer("Java");
//		sbf.append("  With Selenium");
//		System.out.println(sbf);
		
//		
//		StringBuffer sbf1 = new StringBuffer("Java");
//		System.out.println(sbf1.reverse());
		
		StringBuilderAndStringBuffer sbsbf = new StringBuilderAndStringBuffer();
		String rev = sbsbf.reverseString("JAVA");
		String rev1 = sbsbf.reverseString("J");
//		String rev2 = sbsbf.reverseString(null);
		String rev3 = sbsbf.reverseString("%^&*");
		String rev4 = sbsbf.reverseString("Testing  ");
		
		
		System.out.println(rev);
		
		
		

	}

}
