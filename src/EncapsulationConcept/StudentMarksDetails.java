package EncapsulationConcept;

public class StudentMarksDetails {
	
	private String StudentName;
	private int ClassStand;
	private float Marks;
	private double totalMakrs;
	
	
	public StudentMarksDetails(String StudentName,int ClassStand,float Marks,double totalMakrs) {
		this.StudentName = StudentName;
		this.ClassStand = ClassStand;
		this.Marks = Marks;
		this.totalMakrs = totalMakrs;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getClassStand() {
		return ClassStand;
	}

	public void setClassStand(int classStand) {
		ClassStand = classStand;
	}

	public float getMarks() {
		return Marks;
	}

	public void setMarks(float marks) {
		Marks = marks;
	}

	public double getTotalMakrs() {
		return totalMakrs;
	}

	public void setTotalMakrs(double totalMakrs) {
		this.totalMakrs = totalMakrs;
	}
	
	
	public void getStudentRecords() {
		if(Marks>=90) {
			System.out.println(getStudentName()+" " +"passed with Distingsion");
		}
		else {
			System.out.println( getStudentName() +" "+"Passed with Grade B ");
		}
		System.out.println("Student name is "+ getStudentName());
		System.out.println("Student Class standard is "+ getClassStand());
		System.out.println("Student Marks is : " + getMarks());
		System.out.println("Student Total marks is "+ getTotalMakrs());
		
	}

}



