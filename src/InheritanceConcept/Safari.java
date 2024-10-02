package InheritanceConcept;

public class Safari extends Car{
	
	int speed = 200;
  
	@Override
	public void Start() {
		System.out.println("Safari Started");
	}
	
	public void autoParking() {
		System.out.println("Safar AutoParked");
	}
	
	public void AutoColourChange() {
		System.out.println("Safari Auto colour Changed");
	}
	
	@Override
	public void Stop() {
		System.out.println("Safari Stoped");
	}
	
	@Override
	public void Engine() {
		System.out.println("Safari Petrol Variant");
	}
	
	//Method Hidding
//	public static void callBilling() {
//		System.out.println("Safari---Billing");
//	}
	

	private void getCarInfo() {
		System.out.println("Car --get info");
	}
	
	public void getinfo() {
		getCarInfo();
	}
	
//Final method can not be done
////	@Override
//	public final void  getCarweight() {
//		System.out.println("Car Weight");
////		
////	}
	}
	
	


