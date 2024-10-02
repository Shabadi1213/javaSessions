package JavaAssignmentsPractise;

public class InterestRateBasedOnLoantype {

	public static void main(String[] args) {
		// WAP to define the interest rate on the basis of Loan type using Switch Case
		//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		

		double userSalary = 35000;
		String loanType = "Housing loan";
		double interestRate = 0.0;
		
		switch (loanType.toLowerCase().trim()) {
		case "car loan":
			interestRate =6.5;
			break;
		case "housing loan":
			interestRate = 8.5;
			if(userSalary <=35000) {
				interestRate = 0.0;
				System.out.println("NOT APPLICABLE FOR Housing Loan has your salary is less than 35000 USD");
				break;
			}
			else{
				System.out.println("Your eligible for " + loanType+"");
				}
			    
		case "personal loan":
			interestRate = 10.0;
			break;
		case "education loan":
			interestRate = 9.00;
			break;
		default:
			System.out.println(" Entered loan type" + loanType + "is not available");	
		
		}
		
       System.out.println("Interst rate for "+ loanType + " is "+ interestRate + "%");
	}

}
