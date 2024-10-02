package javasessions;

public class CallByRef {
	
	String name;
	int age;
	char gender;
	
	public void m1(String a,int b,char c) {
		System.out.println(a + " "+ b +" "+ c);	
		    
	}
	
	
	public static void t1(CallByRef f1) {
		System.out.println("Static t1 method");
		f1.m1("Shabadi",20,'F');
		
		f1.name = "Shwetha";
		f1.age = 37;
		f1.gender = 'F';
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		CallByRef obj = new CallByRef();
		
		obj.m1("Kushal", 7, 'M');
		
		CallByRef .t1(obj);
		System.out.println(obj.name +" "+ obj.age +" " + obj.gender);
//		System.out.println(obj.age);
//		System.out.println(obj.gender);
//		
		

	}

}
