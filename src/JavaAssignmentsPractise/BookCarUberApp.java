package JavaAssignmentsPractise;

public class BookCarUberApp {

	public static void main(String[] args) {
	//WAP to book the specific type of car from the Uber app using Switch - Case. 
	//1) Car Type: Mini, Sedan, SUV, Premium
	//2) If user passes wrong car type, print please select the right car type
		
		String carType = "SUV";
		switch (carType.toLowerCase().trim()) {
		case "mini":
			System.out.println("Selected car type " + carType + " is Booked");
			break;
		case "sedan":
			System.out.println("Selected car type " + carType + " is Booked");
			break;
		case "suv":
			System.out.println("Selected car type " + carType + " is Booked");
		    break;
		case "premium":
			System.out.println("Selected car type " + carType + " is Booked");
			break;
		default:
			System.out.println("Please select the right car type :" + carType);
			
		
		}
		
		
		
		
		

	}

}
