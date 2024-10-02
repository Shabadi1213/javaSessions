package AccessModifier1;

public class Car{

//Class variables or Global variables	
	String name;
	public int price;
	protected String color;
	private String chasisNum;
	
	//Constructors
	Car() {
		System.out.println("Default constructor");
	}
	
	public Car(int year) {
		System.out.println("public  constructor");
	}
	
	protected Car(String name) {
		System.out.println("protected constructor");
	}
	
	
	private Car(String name,int price) {
		System.out.println("Priavte const...");
	}

	
	
	//Methods
	void m1() {
		System.out.println("Default Method");
	}
	
	public void m2() {
		System.out.println("Public Method");
		}
	
	private void m3() {
		System.out.println("Private method");
	}
	
	protected void m4() {
		System.out.println("Protected method");
		
	}
	
	public static void main(String[] args) {
		
	// Within the same class we can access all type of access modifiers  Default,public,protected and Private
//		Car c = new Car();
//		c.chasisNum = "123";//Private
//		c.color= "Blue";//Protected
//		c.name="Safari";//default
//		c.price = 3000000;//Public
		
		Car c = new Car();
		Car c1 = new Car(5);
		Car c2 = new Car("Tata Safari");
		Car c3 = new Car("Safari", 3000000);
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		
	

	}

}
