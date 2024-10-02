package javasessions;

public class FunctionsInJava {
	
	//Function or Method are same
	
	
	//There are 4 type of functions
	//1.No input-->No Return
	//2.No input-->Return
	//3.Input-->No Return
	//4.Input--->Return
	
	
	
	//Creating function with No input and No return
	
	public void test() {
		
		System.out.println("my first java function");
		
	}
	
	
	// Function with No input but with return
	public int addtion() {
		
		int a = 10;
		int b = 30;
		int c = a+b;
		return c;
	}
	
	
	// Function with Input but no return
	   
	  public void isElementVisible() {
		  boolean flag = true;
		  System.out.println("Expected element visable : " + flag);
	  }
	
	
	//Function with input and with return
	
	public int multiplication(int a,int b) {
		int mul = (a*b);
		return mul;
			
	}
	
	
	

	public static void main(String[] args) {
		
		//Create the object 
		
		FunctionsInJava funobj = new FunctionsInJava();
		funobj.test();
		
		
		int sum = funobj.addtion();
		System.out.println("Addtion of two numbers :" + sum);
		
		
		int mul = funobj.multiplication(10, 30);
		System.out.println("Product of 2 number is " + mul);
		
		
		funobj.isElementVisible();
	}

}
