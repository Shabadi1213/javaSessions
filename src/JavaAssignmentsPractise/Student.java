package JavaAssignmentsPractise;

public class Student {
	//Create two Student objects and initialize their properties.
	//Print the details of each student and the total number of students.
	//Modify the age of one student and print the updated details.
	//Create another Student object and update the total number of students.
	//Print the details of the new student and the updated total number of students.
	
	String name;
	int age;
	
		

	public static void main(String[] args) {
		
		int totalNumberofStudent = 0;
		
		Student st1 = new Student();
		st1.name = "Ravi";
		st1.age = 42;
		totalNumberofStudent++;
//		System.out.println(st1.name +" "+st1.age);
		
		st1.age = 43;
		System.out.println(st1.name +" "+st1.age+" " + totalNumberofStudent);
		
		
		
		Student st2 = new Student();
		st2.name = "Kushal";
		st2.age = 7;
		totalNumberofStudent++;
		System.out.println(st2.name+" "+st2.age +"" + totalNumberofStudent);
		
		Student st3 = new Student();
		st3.name = "Shwetha";
		st3.age = 37;
		totalNumberofStudent++;
		System.out.println(st3.name +" "+st3.age +" "+ totalNumberofStudent);
		
		Student st4 = new Student();
		st4.name = "Shabadi";
		st4.age = 10;
		totalNumberofStudent++;
		System.out.println(st4.name +" " +st4.age + " "+ totalNumberofStudent);
		
	}

}
