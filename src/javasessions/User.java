package javasessions;

public class User {
	
	String name;
	int age;
	static final String place = "Banglore";
	

	public static void main(String[] args) {
		
		User U1 = new User();
		U1.name = "Ravi";
		U1.age = 42;
				
		User U2 = new User();
		U2.name = "Shwetha";
		U2.age = 37;
				
		User U3 = new User();
		U3.name = "Kushal";
		U3.age = 7;
		
		User U4 = new User();
		U4.name = "Shabadi";
		U4.age = 6;
	
		// Accessing static variable
		System.out.println(User.place);
		System.out.println(place);
		
//		User.place = "Manglore";	
		
		U1=U2=U3=U4;
		
		System.out.println(U1.name +" "+U1.age+" "+User.place);
		System.out.println(U2.name +" "+U2.age+" "+User.place);
		System.out.println(U3.name +" "+U3.age+" "+User.place);
		System.out.println(U4.name +" "+U4.age+" "+User.place);
		
		
		
		
		
	

	}

}
