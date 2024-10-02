package JavaAssignmentsPractise;

public class MultiplesOf9Series {
	
	//Multiples of 9 Series: Develop a Java program to print the series of numbers where each number is a multiple of 9, 
	//starting from 0 and ending at 99
	
	public void getMultipleOfNine(int a) {
		for(int i = 0;i<=a;i++) {
			if(i % 9==0) {
				System.out.println(i);
			}
		}
			
		
	}

	public static void main(String[] args) {
		
		
		MultiplesOf9Series obj = new MultiplesOf9Series();
		obj.getMultipleOfNine(99);

	}

}
