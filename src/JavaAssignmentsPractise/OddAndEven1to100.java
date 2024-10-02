package JavaAssignmentsPractise;

public class OddAndEven1to100 {

	public String getOddEvenNumber(int a) {
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}

		}
		return "Done";
	}
		
		
		
	
	
	public static void main(String[] args) {
		
		OddAndEven1to100 obj = new OddAndEven1to100();
		String res =obj.getOddEvenNumber(10);
		System.out.println(res);
		


	}

}
