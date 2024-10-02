package StringManipulations;

public class StringComparsion {

	public static void main(String[] args) {
		
		String s1 = "Hello Selenium";// Is called String literals
		
		String s2 = new String("Hello Selenium");//Using new Keyword
		
		System.out.println(s1==s2);//False:-Comparing the reference obj names
		
		System.out.println(s1.equals(s2));//True:=Compares the actual content

	}

}
