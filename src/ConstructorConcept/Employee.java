package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	char gender;
	boolean isPerm;

	
	public Employee() {
		System.out.println("Default const....");
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary, char gender, boolean isPerm) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		System.out.println("no input");

		Employee e2 = new Employee("Ravi", 42);
		System.out.println(e2.name + " " + e2.age);

		Employee e3 = new Employee("Shabdi", 37, 'F');
		System.out.println(e3.name + " " + e3.age + " " + e3.gender);

		Employee e4 = new Employee("Kushal", 7, 45.50000, 'M', true);
		System.out.println(e4.name + " " + e4.age + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		e4.salary = 65.000000;
		System.out.println(e4.name + " " + e4.age + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
	}

}
