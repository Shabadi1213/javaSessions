package JavaAssignmentsPractise;

public class HelloWorldTenTimes {
	
	// Write a program in Java to print "Hello World" ten times using while loop
	
	public void WhileloopMethod(int a) {
		int i = 1;
		int count = 1;
		while(i<=a) {
			System.out.println("Hello World " + count +"");
			i++;
			count = count+1;
		}
	}

	public static void main(String[] args) {
		
		HelloWorldTenTimes obj = new HelloWorldTenTimes();
		obj.WhileloopMethod(10);

	}

}
