package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {
		
		String Browser = "Safari";
		
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "firefox":
			System.out.println("FF is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;

		default:
			System.out.println("Please enter the correct browser name : "+ Browser);
			
			throw new MyException("======BROWSER ENETRED WRONG=========");
		}
		
		
		System.out.println("Launch URL");
		System.out.println("Login to page");
		System.out.println("Perform Search");
		System.out.println("Logout");
		

	}

}
