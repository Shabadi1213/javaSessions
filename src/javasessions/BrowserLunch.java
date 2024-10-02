package javasessions;

public class BrowserLunch {
	boolean flag = true;
	
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser name : "+" "+ browserName);
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome brower is launching");
			break;
				
		case "firefox":
			System.out.println("Firefox is launching");
			break;
			
		case "edge":
			System.out.println("Edge browser is launching");
			break;
			
		default:
			System.out.println("PLease enter correct Browser name :" + browserName);
			flag = false;
			break;
			
		}
		
		return flag;
			
	}


	public static void main(String[] args) {
		
		BrowserLunch bro_obj = new BrowserLunch();
		boolean res = bro_obj.launchBrowser("Safari");
		System.out.println(res);
		if(res) {
			System.out.println("Enter the URL");
		}
		
		
		
	}

}
