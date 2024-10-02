package EncapsulationConcept;

public class TestEmp {

	public static void main(String[] args) {
		
		Emplyoee e1 = new Emplyoee("Shabadi",42,40.50,true);
         System.out.println(e1.getName()+" " + e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
         
         e1.setName("Ravi");
         System.out.println(e1.getName()+" " + e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
         
         
         Browser br = new Browser();
         br.LaunchBrowser();
         
         
         
         //LoginPage
         
//         LoginPage lp1 =new LoginPage();
//         lp1.setuserName("Ravi@123.com");
//         lp1.setPassword("12345678");
		
		
         LoginPage lp2 = new LoginPage("tejas82in@gmail.com", "kushal123");
       
          lp2.doLogin();
          System.out.println(lp2.getUserName() + " " + lp2.getPassword());
         
        
	}
}
