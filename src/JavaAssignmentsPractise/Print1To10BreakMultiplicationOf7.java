package JavaAssignmentsPractise;

public class Print1To10BreakMultiplicationOf7 {
	
	//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
	
	public void get1To10Multi7break(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if (i%7==0) {
				System.out.println("Bye!! see you tomorrow");
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		
		Print1To10BreakMultiplicationOf7 obj = new Print1To10BreakMultiplicationOf7();
		obj.get1To10Multi7break(10);
		
		
	}

}
