package AccessModifier1;

public class BMW extends Car{
	

	public static void main(String[] args) {
		
		// Within the same Package and Subclass we can access only Default,public,protected type modifiers not private 
		
		BMW b = new BMW();
		Car c = new Car();
		Car c3 = new Car(10);
		Car c4 = new Car("Hyundai");
		
		b.color = "Blue";//Protected
		b.name = "TATA";//Default
		b.price = 2500000;//Public
		
		b.m1();
		b.m2();
		b.m4();
		
		
	

	}

}
