package javasessions;

public class FunctionsInJava2 {
	
	//WAF
	//Create a function which will return the marks of the customer on basis of customer name
	//name:getCustomerMarks(String name)
	//return:marks(int)
	
	public int getCustomerMarks(String name) { 

		System.out.println("Customer name is : " + name);

		if (name.trim().equalsIgnoreCase("Ravi")) {
			return 25;
		} else if (name.trim().equalsIgnoreCase("Shwetha")) {
			return 95;
		} else if (name.trim().equalsIgnoreCase("Kushal")) {
			return 100;
		} else if (name.trim().equalsIgnoreCase("Shabadi")) {
			return 0;
		} else {
			System.out.println("Please enter the correct name :" + name);
			return -1;

				}

	}

	public static void main(String[] args) {
		
		
		FunctionsInJava2 cusmarks = new FunctionsInJava2();
        String str = "Ravi";
		int marks = cusmarks.getCustomerMarks(str);
		System.out.println("The marks of " + str + " is "  + marks);

		
		if (marks<0) {
			System.out.println("Please enter Marks greater than 0");
		}
		else if (marks == 0) {
			System.out.println("Marks sheet ");
		}

		else if (marks >= 0 && marks<35) {
			System.out.println("Candidate got failed : " + marks);

		} else if (marks <= 35 && marks > 60) {
			System.out.println("Candiate passed with marks " + marks);
		} else {
			System.out.println("Candiate passed in distingsion " + marks);
		}

	}

}
