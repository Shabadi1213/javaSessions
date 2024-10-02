package EncapsulationConcept;

public class LoginPage {
	
	private String userName;
	private String password;
	
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;

	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
		
		public void doLogin() {
			System.out.println("Enter User Name " + getUserName());
			System.out.println("Enter pwd " + getPassword());
			System.out.println("Clicked on user name ");
			System.out.println("User is logged in...!!");
			
		
			
		}
	}


