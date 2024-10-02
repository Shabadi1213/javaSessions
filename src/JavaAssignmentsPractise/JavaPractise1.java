package JavaAssignmentsPractise;

public class JavaPractise1 {
	
	// Addition to 2 Strings

	public String addTwoStrings(String name1, String name2) {

		String s1 = name1;
		String s2 = name2;
		String s3 = s1 + s2;
		return s3;
	}

	// Sum of 2 numbers
	public int addition(int a, int b,int c) {
		int sum = a + b + c;
		return sum;
	}

	// Division of 2 numbers

	public int Divisionoftwonumbers(int a, int b) {
		int div = a / b;
		return div;
	}
	
	public double Decimaldiv() {
		double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		return num;
		
	}
	
	public String ConcatinationString(String s1, char s2) {

		String s3 = s1 + s2;
		return s3;
	}

	public int Ascii(int n) {
		int res = (byte)n;
		return res+3;

	}
	
	
	public double SquareOfNumber(double n) {
		double squarNumber = n*n;
//		double squarNumber = Math.pow(num,n);
		return squarNumber;
	}
	
	
	
	
	public static void main(String[] args) {
		
				
		JavaPractise1 obj = new JavaPractise1();
		String str1 = "Hello ";
		String str2 = "Java";
		String concatString = obj.addTwoStrings(str1,str2);
		System.out.println("Concatination of "+ str1 + " and " + str2 + " is : "+ concatString);
		
		int a = 100;
		int b = 200;
		int c = 3400;
		int sum = obj.addition(a, b,c);
//		System.out.println("Addition of " + a + " and "+ b +" and " + c + " is :" + sum);
		System.out.println("Your Total amount is :" + sum);
		
		
		int i = 40;
		int j= 8;
		int div = obj.Divisionoftwonumbers(i,j);
		System.out.println("Disvison of " + i + " and " + j +" is: " + div);	
		
		
		double div1 = obj.Decimaldiv();
		System.out.println(div1);
		
		
		String str3 = "Hello Selenium";
		char str4 = 't';
		String constring = obj.ConcatinationString(str3, str4);
		System.out.println(constring);
		
		
		int n = 'd';
		int ascidata= obj.Ascii(n);
		System.out.println((char) ascidata);
		
//		double num = 3.9;
		double k = 3.9;
		double res = obj.SquareOfNumber(k);
		System.out.println(res);
	
		
		

	}

}
