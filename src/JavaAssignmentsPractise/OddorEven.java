package JavaAssignmentsPractise;

public class OddorEven {
	
	public void findOddOrEven(int a) {
		
		if(a%2==0) {
			System.out.println("Entered number :" + a + " "+ "is Even Number" ); 
		}
		else {
			System.out.println("Entered number :" + a + " "+ "is Odd Number" );
		}
		
	}

	public static void main(String[] args) {
		
		OddorEven obj = new OddorEven();
		obj.findOddOrEven(-2);

	}

}
