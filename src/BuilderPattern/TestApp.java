package BuilderPattern;

public class TestApp {

	public static void main(String[] args) {
		
		Application app = new Application();
		
		
		//Workflow chain scenario or Builder pattern
		
		app.login("Ravi@gmail.com", "ravi@1234")
			.search("Macbook Pro", 67000)
				.addToCart("Macbook Pro")
					.doPayment("1234 4567 2345 1234", 123)
						.genrateOrder()
							.logout();
		
		System.out.println("================2nd flow====================");

		
		app.login().search("Cricket bat")
			.addToCart("Cricket bat")
				.logout();
		
		
		System.out.println("===================3rd flow===================");
		
		app.login("Ravi@gmail.com", "ravi@1234")
			.search("Laptop", 30000)
				.logout();
			
	}

}

// this is used:
  //1. To initialze the class variables with constructor or Methods
  //2. is used with setter and getter in Encapsulation
  //3 .is used to call a same class constructor
  //4. is used to return this from a function in builder pattern
