package EncapsulationConcept;

public class Bank {
	
	private String CustName;
	private int age;
	private double salary;//Salary>100000 Gold account if not classic account
	private String aadharNum;
	private String phoneNum;
	
	
	public Bank(String CustName,int age,double salary,String aadharNum,String phoneNum) {
		this.CustName = CustName;
		if(age>=15) {
		this.age = age;
		}
		if(salary>=100000) {
		this.salary = salary;
		}
		this.aadharNum = aadharNum;
		this.phoneNum = phoneNum;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	public void createAccount() {
		if (this.age >= 15) {
			if (salary >= 100000) {
				System.out.println("Eligible for Gold Membership Account");
			} else {
				System.out.println("Eligible for classic Membership Account");
			}
		}

		else {
			System.out.println("Sorry Minimum age should be 15 to create account");

		}
		
		
	}

}
