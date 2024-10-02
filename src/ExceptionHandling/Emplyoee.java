package ExceptionHandling;

public class Emplyoee {
	
	public void empName(String name) {
		System.out.println("Emply name " + name);
		}
		
	public void empAge(int a) {
		System.out.println("Emply age :"+ a);
		try {
		int x= 9/0;
	}
		
//		catch(ArithmeticException e) {
//			System.out.println("Exception is coming..");
//			e.printStackTrace();
//		}
		
		//This is Common or Single catch block, 
		//but it not good practice as we wont come to know which exception is coming until we run the code
		//Readability  issue so we need to have mulitple catch block for each exception 1 catch block
		
//		catch(Exception e) {
//			System.out.println("Exception is coming..");
//			e.printStackTrace();
//		}
		
		catch(Throwable e) {
			System.out.println("Exception is coming..");
			e.printStackTrace();
		}
		
		
		finally{
			System.out.println("Finally Executed");
		}
	}

}
