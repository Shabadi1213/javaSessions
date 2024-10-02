package javasessions;


public class Employee {
	
	//class :category/template/Blueprint
	//object:physical entity
	
	//Global variables/Class variables or template variables
	String name;
	int age;
	double Salary;
	boolean isPerm;
	char gender;
	

	public static void main(String[] args) {
		//create the object:using new keyword
		//Employee(); //Object or instance of the class
		//obj //object reference name
		//Employee is Class
		//new :keyword
		
		
		
		Employee obj = new Employee();
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.Salary);
		System.out.println(obj.gender);
		
		System.out.println("---------------------");
		
		
		obj.name = "Ravi";
		obj.age = 42;
		obj.isPerm = true;
		obj.Salary = 90;
		obj.gender = 'M';		
		
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.Salary);
		System.out.println(obj.gender);
		
		
		Employee e1 = new Employee();
		e1.name = "ABCD";
		e1.age = 42;
		e1.Salary = 98;
		
		System.out.println(e1.name + " "+e1.age +" "+e1.isPerm +" "+e1.Salary );
		
		
		//No reference object 
		new Employee();	
		
		
		

	}

}
