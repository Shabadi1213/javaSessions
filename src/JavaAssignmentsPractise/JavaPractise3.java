package JavaAssignmentsPractise;

public class JavaPractise3 {
	
	//Find out the greatest number out of three/four different given numbers:
	//Input the 1st number: 25 
	//Input the 2nd number: 78 
	//Input the 3rd number: 87
	//Input the 4th number: 100
	
	public int findGreatestNumber(int a, int b, int c, int d) {
		if (a > b && a > c && a > d) {
			return a;
		} else if (b > c && b > a && b > d) {
			return b;
		} else if (c > d) {
			return c;
		} else {
			return d;
		}
		

	}

	public static void main(String[] args) {
		
		JavaPractise3 obj = new JavaPractise3();
		int grtNum = obj.findGreatestNumber(69, 2003, 100,43);
		System.out.println("The greatest number is " + grtNum);
	
	
		
}
}
