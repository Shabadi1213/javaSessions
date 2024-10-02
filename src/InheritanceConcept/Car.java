package InheritanceConcept;

public class Car extends Vehicle {
	
	int speed =100;

	public void Start() {
		System.out.println("Car Started");
	}
	
	public void Stop() {
		System.out.println("Car Stoped");
	}
	
	public void carRefule() {
		System.out.println("Car Refuled");
	}
	
	public void Engine() {
		System.out.println("Car default engine");
	}
	
	//Static Methods can not be overridden
	public static void callBilling() {
		System.out.println("Car---Billing");
	}
	
	//Private can not be Overridden
//	private void getCarInfo() {
//		System.out.println("Car --get info");
//	}
	
	public final void getCarweight() {
		System.out.println("Car Weight");
	}
	
	
	
	
}
