package StringManipulations;

import java.util.Arrays;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String M1 = "‘Relief’, ‘the fight continues’: "
				+ "France players react to election results ahead of EURO 2024 semifinal";
		
//		if(M1.indexOf("EURO")>=0) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}

		
//      if(M1.contains("EUrRO")) {
//    	  System.out.println("Present");
//      }
//      else {
//    	  System.out.println("Not Present");
//      }
//    
		//Upper_Lower_trim Functions
      
//      String t1 = " hello World ";
//      System.out.println(t1.trim());
//      System.out.println(t1.toUpperCase().trim());
//      System.out.println(t1.toLowerCase().trim());
      
      // Replace function
      
//      String m2 = "Hello Word";
//      System.out.println(m2.replace(" ", ""));
//      System.out.println(m2.replace("Hello", "Hi"));
      
      
      //Equals
      
//      String r1 = "Hello Selenium";
//      String r2 = "Hello selenium ";
//      System.out.println(r1.equals(r2));//flase
//      System.out.println(r1.equalsIgnoreCase(r2.trim()));//True
      
		
		
		//Split:
		
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String m [] = lang.split("_");
		System.out.println(Arrays.toString(m));
		System.out.println(m[3]);
		System.out.println(m.length);
		
		
		String pop = "abHelloAabSeleniumAabWord";//[,HelloA,SeleniumA,Word]
		String x[] = pop.split("ab");
		System.out.println(x[0]);//Nothing
		System.out.println(Arrays.toString(x));
		
//		try {
//		System.out.println(x[4]);//AIOB
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("AIOB is coming...");
//		}
//		
	
		System.out.println("Ravi:JAVA:SELENIUM:CODING".split(":")[0]);
		
		String otp = "your otp number is very long 12345";
		String m1 [] = otp.split(" ");
		System.out.println(Arrays.toString(m1));
		int len = m1.length;
		System.out.println(m1[len-1]);

		
		
		
		
	}

}
