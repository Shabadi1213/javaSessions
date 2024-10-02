package JavaAssignmentsPractise;

public class PositiveAndNeagtiveNumber {
	
	public void getPostiveAndNegativeNumber(int a) {
		if (a<0) {
			System.out.println("Entered Number " + a + " "+ "is Negative" );
		}
		else {
			System.out.println("Entered Number " + a + " "+ "is Postive" );
		}
		
		
	}

	public static void main(String[] args) {
		
		PositiveAndNeagtiveNumber obj = new PositiveAndNeagtiveNumber();
		obj.getPostiveAndNegativeNumber(0);

	}

}
