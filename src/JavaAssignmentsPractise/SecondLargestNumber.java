package JavaAssignmentsPractise;

public class SecondLargestNumber {
	
	public int secondLargestNumber(int a, int b, int c) {
		if ((a >=b && a <=c) || (a>=c && a>=b)){
			return a;
		}
		else if ((b >= c && b<=a)||(b>=a && b<=c)) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		
		SecondLargestNumber obj = new SecondLargestNumber();
		int res = obj.secondLargestNumber(1, 80,  100);
		System.out.println("Second largets number is :" +res);
		
		

	}

}
