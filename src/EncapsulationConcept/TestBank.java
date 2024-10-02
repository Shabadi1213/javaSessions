package EncapsulationConcept;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b = new Bank("Ravi", 15, 200000, "AQQ12345", "12345678");
		b.createAccount();
		System.out.println(b.getCustName() + " " + b.getAge() + " "+ b.getSalary()+" "+ b.getAadharNum()+" "+b.getPhoneNum());

	}

}
