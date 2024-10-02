package AccessModifier1;

public class MoterCycle {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.color = "Green";//Protected
		c.name = "NEXA";//Default
		c.price = 1900000;//public
		
		
		c.m1();
		c.m2();
		c.m4();

	}

}
