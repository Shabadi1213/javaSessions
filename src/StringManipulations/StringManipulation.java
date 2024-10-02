package StringManipulations;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String str = "Hi this is my First Java Code and i am Happy and i am Cool and im crazy";
		int len = str.length();
		System.out.println(len);
		System.out.println(len-1);
		
		
		System.out.println(str.charAt(43));// y
		
//		try {
//		System.out.println(str.charAt(44));//SIOB
//		}
//		catch(StringIndexOutOfBoundsException  e) {
//			System.out.println("SIOB coming");
//		}
		
		
		System.out.println(str.indexOf('i'));//39  First occurrence of i
		System.out.println((str.indexOf('i',str.indexOf('i')+1 )));//11 2nd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1));//14 3rd occurrence of i
		
		int x = str.indexOf('i', str.indexOf('i')+1);
		int y  = str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1);
		int z = str.indexOf('i',str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1);
		int m = str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1);
		int n = str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1)+1);
		int k = str.indexOf('i', str.indexOf('i',str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1)+1)+1);
		
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1 ));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1));
        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1)+1));
        
        System.out.println(str.indexOf('i', k));
        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i',str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1)+1)+1)));
        
        
        System.out.println(str.indexOf("Python"));/// -1 as python is not present in given string literals
        
        
        
        
        
	}
	

}