package InterfaceConcept;

public interface USMedicals extends WHO{
	
	int Medicfee = 100;
	
	public void nueroServices();
	
	public void cardioServices();
	
	public void pediatricServices();
	
	public void OPDServices();
	
	public void covidVaccine();
	
	public void labtest();
	
	public void emergencyServices();
	
	
	//Static Methods can not be Overridden can only Overloaded
	public static void MedicalBills() {
		System.out.println("US medical Bills");
	}
	
	
	default void MedicReports() {
		System.out.println("US Medic reports");
		
	}
	
	
	
	

}
