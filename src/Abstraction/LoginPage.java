package Abstraction;

public class LoginPage extends Page {
	
	
	public LoginPage() {
		System.out.println("LoginPage...Const..Default");
	}
	
	public LoginPage(int a) {
		System.out.println("LoginPage...Const.."+ a);
	}
	
	public LoginPage(int a,int b) {
		System.out.println("LoginPage...Const.."+ (a+b));
	}
	

	@Override
	public void title() {
		System.out.println("Login title page");
		
	}

	@Override
	public void getUrl() {
		System.out.println("Login page url");
		
	}
	
	@Override
	public void loading() {
		System.out.println("LoginPage Loading...in 5 secs.");
		super.loading();
	}

	
	
	public void doLogin() {
		System.out.println("Login to App");
	}
}
