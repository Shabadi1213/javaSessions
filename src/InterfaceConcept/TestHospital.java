package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortiesHospital fh = new FortiesHospital();
		fh.cardioServices();
		fh.nueroServices();
		fh.OPDServices();
		fh.pediatricServices();
		
		fh.DermoServices();
		fh.OngolgyServices();
		fh.orthoServices();
		
		fh.eNTServices();
		fh.pythologieServices();
		fh.UrologieServices();
		
		fh.MedicalTest();
		fh.covidVaccine();
		fh.MedicReports();
		System.out.println(USMedicals.Medicfee);
		System.out.println(FortiesHospital.Medicfee);

		System.out.println(FortiesHospital.Medicfee);
		
//		FortiesHospital.MedicalBills();
		USMedicals.MedicalBills();
		
		fh.emergencyServices();
		fh.MedicalProcess();
		
		fh.MedicalNews();
	
		
		// Top casting-A child class can be refereed by parent interface reference variable		
		
		USMedicals us = new FortiesHospital();
		us.cardioServices();
		us.covidLabTest();
		us.covidVaccine();
		us.emergencyServices();
		us.nueroServices();
		us.OPDServices();
		us.pediatricServices();
		us.MedicReports();
		us.MedicalProcess();
		
		MedicalBody mb = new MedicalBody();
		mb.MedicalNews();
	  
		Apolo ap = new Apolo();
		ap.YogaThearpy();
		
	}

}
