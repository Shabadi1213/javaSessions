package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		Safari sf = new Safari();
		
		sf.Start();
		sf.autoParking();
		sf.carRefule();
		sf.AutoColourChange();
		sf.Stop();
		sf.Engine();
//		sf.callBilling();
		sf.getCarweight();
		System.out.println("Safari speed is : " + sf.speed);
		
		System.out.println("====================Parent Class==========");
		
		Car c = new Car();
		c.carRefule();
		c.Start();
		c.Stop();
//		c.callBilling();
		c.getCarweight();
		System.out.println("Car speed is : " + c.speed);
		
		
			
		

	}

}
