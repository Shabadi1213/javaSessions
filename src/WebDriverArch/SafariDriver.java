package WebDriverArch;

public class SafariDriver implements WebDriver{
	
	
	public SafariDriver() {
		System.out.println("Launching SafariBrowser");
	}
	
	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void getUrl(String Url) {
		System.out.println("Entering URL"+ Url);
		
	}

	@Override
	public void close() {
		System.out.println("Closing browser");
		
	}


	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value " + value+" in to filed"+ element);
		
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on Element");
		
	}

}
