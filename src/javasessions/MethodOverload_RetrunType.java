package javasessions;

public class MethodOverload_RetrunType {
	
	//Method Overload or Polymorphism/ComplieTime Polymorphism/Static 
	//With in a class if we have multiple methods
	//With same Method name
	//With different number of parameters
	//With different sequence of parameters
	//return type dosen't matter
	
	public void Test() {
		System.out.println("NO input");
	}

	public void Test(int a) {
		System.out.println("The number is :" + a);

	}

	public int Test(int t, int y) {
		return t + y;
	}

	public void Test(String a) {
		System.out.println(a);

	}

	public void Test(String a, String b) {
		System.out.println(a + " " + b);

	}

	public void Test(int g, String d) {
		System.out.println(g + d);

	}

	public void Test(String e1, int m1) {
		System.out.println(e1 + m1);

	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MethodOverload_RetrunType obj = new MethodOverload_RetrunType();
		obj.Test();
		obj.Test(23);
		
		obj.Test("Java with Selenium");
		
		int res = obj.Test(35, 45);
		System.out.println(res);
		
		obj.Test(1982, "Ravi");
		
		obj.Test("Shabadi", 82);
		
		obj.Test("Kushal", "Shabadi");
		

	}

}
