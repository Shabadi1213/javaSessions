package JavaAssignmentsPractise;

public class PrintSeriesOfEvenNum2To200 {

	//Even Numbers Series: Write a Java program to print the series of even numbers from 2 to 100.
	
	public void printEvenNumbers(int a) {
			for (int i = 2;i<=a;i++) {
			if(i % 2==0) {
				System.out.println(i);
			}
			
		} 
			
	}
	
	
	public static void main(String[] args) {
		
		PrintSeriesOfEvenNum2To200 obj = new PrintSeriesOfEvenNum2To200();
		obj.printEvenNumbers(200);
		

	}

}
