package SuperKeyword;

public class Car extends Vehicle {
	
	int speed = 200;
	
	
	
	public Car() {
		System.out.println("Car Default Const...");
	}
	
	public Car(int a) {
		System.out.println("Car Const..."+ a);
	}
	
	public Car(int a,int b) {
		System.out.println("Car Const..."+ (a+b));
	}
	
	
	
	public void start() {
		System.out.println("Car start");
	}
	
	public void Refuel() {
		System.out.println("Car refule");
	}
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
	
}