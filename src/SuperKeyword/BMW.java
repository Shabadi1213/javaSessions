package SuperKeyword;

public class BMW extends Car{
	
	int speed = 300;

	
	@Override
	public void start() {
		System.out.println("BMW start");
		super.start();
		super.stop();
	}
	
	
	@Override
	public void Refuel() {
		System.out.println("BMW refuel");
	}
	
	
	public void displaySpeed() {
		System.out.println("BMW speed = "+ speed);
		System.out.println("Parent speed = "+ super.speed);
		
	}
	
}
