package JavaAssignmentsPractise;

public class Car {
	String brand;
	String model;
	int year;

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.brand = "Hyundai";
		car1.model = "I20Active";
		car1.year = 2018;
		
		Car car2 = new Car();
		car2.brand = "Tata";
		car2.model = "TataSafari";
		car2.year = 2024;
		
		Car car3 = new Car();
		car3.brand = "Mahindra";
		car3.model = "XUV700";
		car3.year = 1990;
		
		Car car4 = new Car();
		car4.brand = "Nexa";
		car4.model = "Grand Vitra";
		car4.year = 2023;
		
		System.out.println("Car details are "+ car1.brand+" "+car1.model+" "+ car1.year);
		System.out.println("Car details are "+ car2.brand+" "+car2.model+" "+ car2.year);
		System.out.println("Car details are "+ car3.brand+" "+car3.model+" "+ car3.year);
		System.out.println("Car details are "+ car4.brand+" "+car4.model+" "+ car4.year);
		
		System.out.println("=============================Car1=Car2===================");
		car1 = car2;
		System.out.println("Car details are "+ car1.brand+" "+car1.model+" "+ car1.year);
		System.out.println("Car details are "+ car2.brand+" "+car2.model+" "+ car2.year);
		System.out.println("Car details are "+ car3.brand+" "+car3.model+" "+ car3.year);
		System.out.println("Car details are "+ car4.brand+" "+car4.model+" "+ car4.year);
		
		System.out.println("=============================Car2=Car3===================");
//		
		car2 = car3;
		System.out.println("Car details are "+ car1.brand+" "+car1.model+" "+ car1.year);
		System.out.println("Car details are "+ car2.brand+" "+car2.model+" "+ car2.year);
		System.out.println("Car details are "+ car3.brand+" "+car3.model+" "+ car3.year);
		System.out.println("Car details are "+ car4.brand+" "+car4.model+" "+ car4.year);
//		
		System.out.println("=============================Car3=Car4===================");
//		
		car4=car3;
		System.out.println("Car details are "+ car1.brand+" "+car1.model+" "+ car1.year);
		System.out.println("Car details are "+ car2.brand+" "+car2.model+" "+ car2.year);
		System.out.println("Car details are "+ car3.brand+" "+car3.model+" "+ car3.year);
		System.out.println("Car details are "+ car4.brand+" "+car4.model+" "+ car4.year);
		
		System.out.println("=============================Car4=Car1===================");
//		
		car1=car4;
		System.out.println("Car details are "+ car1.brand+" "+car1.model+" "+ car1.year);
		System.out.println("Car details are "+ car2.brand+" "+car2.model+" "+ car2.year);
		System.out.println("Car details are "+ car3.brand+" "+car3.model+" "+ car3.year);
		System.out.println("Car details are "+ car4.brand+" "+car4.model+" "+ car4.year);
//		
	}

}
