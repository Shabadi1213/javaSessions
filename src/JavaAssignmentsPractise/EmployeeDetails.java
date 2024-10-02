package JavaAssignmentsPractise;

public class EmployeeDetails {
	
	String name;
	int age;
	double salary;
	double totalsalary;

	public static void main(String[] args) {
		 
		EmployeeDetails e1 = new EmployeeDetails();
		e1.name = "Tomas";
		e1.age = 35;
		e1.salary = 30.56;

		EmployeeDetails e2 = new EmployeeDetails();
		e2.name = "Rahul";
		e2.age = 40;
		e2.salary = 45.89;

		EmployeeDetails e3 = new EmployeeDetails();
		e3.name = "Rajkumara";
		e3.age = 29;
		e3.salary = 20.56;

		System.out.println(
				"Emplyoee details are:- " + "Name:" + e1.name + "," + " Age:" + e1.age + "," + " Salary:" + e1.salary);
		System.out.println(
				"Emplyoee details are:- " + "Name:" + e2.name + "," + " Age:" + e2.age + "," + " Salary:" + e2.salary);
		System.out.println(
				"Emplyoee details are:- " + "Name:" + e3.name + "," + " Age:" + e3.age + "," + " Salary:" + e3.salary);
		System.out.println("Total salary of all emplyoee is :" + " " + (e1.salary + e2.salary + e3.salary));

		e3.salary = 25.56;
		System.out.println("Total salary of all emplyoee is :" + " " + (e1.salary + e2.salary + e3.salary));

		EmployeeDetails e4 = new EmployeeDetails();
		e4.name = "Ram";
		e4.age = 39;
		e4.salary = 70.56;
		System.out.println("Total salary of all emplyoee is :" + " " + (e1.salary + e2.salary + e3.salary + e4.salary));

		System.out.println(
				"Emplyoee details are:- " + "Name:" + e1.name + "," + " Age:" + e1.age + "," + " Salary:" + e1.salary);
		System.out.println(
				"Emplyoee details are:- " + "Name:" + e2.name + "," + " Age:" + e2.age + "," + " Salary:" + e2.salary);
		System.out.println(
				"Emplyoee details are:- " + "Name:" + e3.name + "," + " Age:" + e3.age + "," + " Salary:" + e3.salary);
		System.out.println(
				"Emplyoee details are:- " + "Name:" + e4.name + "," + " Age:" + e4.age + "," + " Salary:" + e4.salary);
		System.out.println("Total salary of all emplyoee is :" + " " + (e1.salary + e2.salary + e3.salary + e4.salary));

	}

}
