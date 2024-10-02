package JavaAssignmentsPractise;

public class loopsAssigments {
	
	public void printRepeatdly(int a) {
		int i = a;
		int count = 1;
		for (i=1;i<=a;i++) {
			System.out.println(" I am Batman " +count+"");
			count = count+1;
		}
		
	}

	public static void main(String[] args) {
		
		loopsAssigments obj = new loopsAssigments();
		obj.printRepeatdly(9);

	}

}
