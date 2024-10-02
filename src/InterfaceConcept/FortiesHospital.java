package InterfaceConcept;

public class FortiesHospital extends MedicalBody implements USMedicals,UKMedicals,IndianMedicals{
	
	static final int Medicfee = 200;
	
	//USMedicals

	@Override
	public void nueroServices() {
		System.out.println("US nueroServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("US cardioServices");

	}

	@Override
	public void pediatricServices() {
		System.out.println("US pediatricServices");

	}

	@Override
	public void OPDServices() {
		System.out.println("US OPDServices");

	}
	
	//UKMedicals

	@Override
	public void eNTServices() {
		System.out.println("UK eNTServices");
		
	}

	@Override
	public void pythologieServices() {
		System.out.println("UK pythologieServices");
		
	}

	@Override
	public void UrologieServices() {
		System.out.println("UK UrologieServices");
		
	}
	
	//IndianMedicals

	@Override
	public void orthoServices() {
		System.out.println("India orthoServices");
		
	}

	@Override
	public void OngolgyServices() {
		System.out.println("India OngolgyServices");
		
	}

	@Override
	public void DermoServices() {
		System.out.println("India DermoServices");
		
	}
		
	
	public void MedicalTest() {
		System.out.println("Fortis Medical Test");
	}


	@Override
	public void covidLabTest() {
		System.out.println("Forties CovidLab Test");
		
	}

	@Override
	public void covidVaccine() {
		System.out.println("Fortise covidVaccine");
		MedicReports();
		
	}

     //Method hiding
	public static void MedicalBills() {
		System.out.println("Forties medical Bills");
		
	}

	@Override
	public void labtest() {
		System.out.println("Lab test");
		
	}

	//Common Method ,Will be overidden only ones
	@Override
	public void emergencyServices() {
		System.out.println("Forties---emergencyServices ");
		
	}
	
	@Override
	public void MedicReports() {
		System.out.println("Forties Medic reports");
		
	}

	@Override
	public void MedicalProcess() {
		System.out.println("Forties MedicalProcess");
		
	}
	
	@Override
	public void MedicalNews() {
		System.out.println("FortiesMedical-----News");
		super.MedicalNews();
	}
	
}
