package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Hello";
		String a = "Selenium";
		char c1 = 'D';
		float f= 2.3f;
		
		System.out.println(s +" "+ a);//Hello Selenium
		System.out.println(s + 'a'+ a+ s);//Hello97HelloSelenium
		System.out.println(s + 'a');// Helloa
		System.out.println('a'+'b');//195
		System.out.println( c1 + 'a');//165
		System.out.println(c1 + a);//DSelenium
		System.out.println('f'+ f);//104.3
		
//		System.out.println(9/0);//AE
		System.out.println(0/9);//0
		System.out.println(10/5);//2
		System.out.println(2/7);//0
		System.out.println(7/2);//3
//		System.out.println(0/0);//AE
		
		System.out.println(0.9/0);//Infinity
		System.out.println(0/0.9);//0.0
		System.out.println(0.0/0.0);//NAN Not a Number
		System.out.println(0.1/0.0);//Infinity
		
		System.out.println(0.1 + 0.2);//0.30000000000000004
		System.out.println(0.4 + 1.8);//2.2
		
		
		System.out.println(5%2);//1
		System.out.println(10%2);//0
		System.out.println(3.4%0.2);//0.1999999999999999
		System.out.println(0%4);//0
//		System.out.println(0%0);//AE
//		
		
		
		
		
	}
 
}
