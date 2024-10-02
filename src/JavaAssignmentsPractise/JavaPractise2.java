package JavaAssignmentsPractise;

public class JavaPractise2 {

	public static void main(String[] args) {
		
		
//		int i =11;
//		i = i++ + ++i;
//		System.out.println(i);
		
		
		
//		int a =11,b=22;
//		int c = a + b + a++ + b++ + ++a + ++b;
//		System.out.println(c);
//		
//		
//		
//		int i=0;
//		i = i++ - --i + ++i - i--;
//		System.out.println(i);
//		
		
//		boolean b =true;
//		b++;//We can convert boolean type to int
//		System.out.println(b);
		
		
//		int i=1, j=2, k=3;
//
//		int m = i-- - j-- - k--;
//
//		System.out.println("i="+i);
//
//		System.out.println("j="+j);
//
//		System.out.println("k="+k);
//
//		System.out.println("m="+m);
		
		
//		int a =1,b=2;
//		System.out.println(--b - ++a + ++b - --a);
//		
//		
//		int i=19, j=29, k=0;
//		int m = i-- - j-- - k--;
//		System.out.println("i="+i);
//		System.out.println("j="+j);
//		System.out.println("k="+k);
		
		
//		int i = 11;
//		int j = --(i++);//Invalid argument
		
		
//		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//		System.out.println(p);
//	
//	int a = 1;
//	 a = a++ + ++a * --a - a--;
//	System.out.println(a);
		
		
//		int a = 11--;///We can't increment or decrement directly on values
//		System.out.println(a);
		
		
		
		
		
//		int ch = 'A';
//		System.out.println(ch++);
//		System.out.println(ch++);
//		
//		int ch = 'A';
//        System.out.println(++ch);
		
		
//		double d = 1.5, D = 2.5;
//		System.out.println(d++ + ++D);//1.5 + 3.5 = 5.0
		
		
		//Q1
		//Widening Casting Assignment: Write a Java program that demonstrates widening casting. 
		//Create variables of different data types such as int, float, double, etc. 
		//Assign values to them and then cast them to a higher data type. 
		//Finally, print out the original and casted values to observe widening casting in action
		
//		int a = 400;
//		float b = 30.56f;
//		double d = 35.10;
//		
//		double doublefromInt = a;
//		double floattoDouble = b;
//		
//		System.out.println("Orignal int value :"+ a);
//		System.out.println("Widen from int to double :" + doublefromInt);
//		System.out.println("Orignal float value :"+ b);
//		System.out.println("Widen from float to double :" + floattoDouble);
		
		System.out.println("--------------------------------------Break----------------------------------");
		
		//Q2: Narrowing Casting Assignment: Develop a Java program to illustrate narrowing casting. 
		//Declare variables of higher data types like double, float, long, etc., and assign values to them. 
		//Then, cast these variables to lower data types like int, short, byte, etc. 
		//Print out the original and casted values to observe narrowing casting in action
		
		
		long  i= 50000000000000L;
		double j = 45.90;
//		int k = 45;
		
		
		long longtoint = (int) i;
		short doubletofloat = (short) j;
//		short inttoshort = (short) k;
//		
		System.out.println("Original value of long int :" + i);
		System.out.println("Narrowed value of int :" + longtoint);
		System.out.println("Original value of double :" + j);
		System.out.println("Narrowed value of double :" + doubletofloat);
//		System.out.println("Original value of  int :" + i);
//		System.out.println("Narrowed value of short int :" + inttoshort);
		
		
		

	}

}
