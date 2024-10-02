package Abstraction;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10,20);
		
		
		
		lp.title();
		lp.getUrl();
		lp.doLogin();
		lp.loading();
		
//		
//		//Top casting
//		
//		Page pg = new LoginPage();
//		pg.getUrl();
//		pg.loading();
//		pg.title();
		

	}

}
