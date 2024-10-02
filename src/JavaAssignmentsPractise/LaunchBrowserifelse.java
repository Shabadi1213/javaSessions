package JavaAssignmentsPractise;

public class LaunchBrowserifelse {
	//WAP to launch browsers using If-ElseIf
	//Browser: Chrome/Firefox/IE/Safari
	//If user passes wrong browser, print please pass the right browser name
	
	public String LaunchBrowser(String name) {
		String Browser = name;
		if(Browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser " + Browser + " is launched");
		}else if(Browser.equalsIgnoreCase("Firefox")){
			System.out.println("Browser " + Browser + " is launched");
		}else if(Browser.equalsIgnoreCase("IE")) {
			System.out.println("Browser " + Browser + " is launched");
		}else if(Browser.equalsIgnoreCase("Safari")) {
			System.out.println("Browser " + Browser + " is launched");
		}else {
			System.out.println(" Please pass the right browser name  : " + Browser);
		}
			
		return Browser;
		
	}

	public static void main(String[] args) {
		
		LaunchBrowserifelse obj = new LaunchBrowserifelse();
		String name = "IE";
		String res  = obj.LaunchBrowser(name);
		System.out.println(res);
		if(res.contentEquals("Chrome")) {
			System.out.println("Get chrome  latest version");
		}
		

	}

}
