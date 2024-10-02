package JavaAssignmentsPractise;

public class SpecificEnvironmentSwitchcase {

	public static void main(String[] args) {
		
		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
     
		String env = " PROD ";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("Running testcases in " + env + " " + "environment");
			break;
		case "stage":
			System.out.println("Running testcases in " + env + " " + "environment");
			break;
		case "dev":
			System.out.println("Running testcases in " + env + " " + "environment");
			break;
		case "uat":
			System.out.println("Running testcases in " + env + " " + "environment");
			break;
		case "prod":
			System.out.println("Running testcases in " + env + " " + "environment");
			break;
		default:
			System.out.println("Please enter correct environment name " + env);
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
