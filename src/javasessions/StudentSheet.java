package javasessions;

public class StudentSheet {
	
	//WAF getStudentMarks(String name)
	//Student marks(int)
	
	public int getStudentMarks(String name) {
		System.out.println("The name of the student : "+ name);
		
		switch (name.toLowerCase().trim()) {
		case "ravi":
			return 90;
		case "kushal":
			return 100;
		case "shwetha":
			return 95;
		default:
			System.out.println("Enter proper name :" + name);
			return -1;

		}
	}

	public static void main(String[] args) {
		
		StudentSheet sm = new StudentSheet(); 
		int stmr = sm.getStudentMarks("Shwetha");
		System.out.println(stmr);

		
		
		
	}

}
