package AccessModifier2;

import AccessModifier1.Car;

	public class Audi extends Car{
		

	Audi() {
			super(10);
			// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) {
		
		
		Audi au = new Audi();
		Car c4 = new Car(10);
		
		au.color = "Yellow";//Protected variable
		au.price = 200000;//Public variable
	
		
        au.m2();
        au.m4();
	}

}
