package JavaAssignmentsPractise;

public class PrintFloatingSeries {
	
	//Floating Point Series: Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
	
	public void getFloatingnumbersSeries(float k) {
		for(float i = 1.0f;i<=k;i++) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		PrintFloatingSeries obj = new PrintFloatingSeries();
		obj.getFloatingnumbersSeries(10.0f);

	}

}
