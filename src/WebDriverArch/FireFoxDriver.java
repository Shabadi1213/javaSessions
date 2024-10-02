package WebDriverArch;

public class FireFoxDriver implements WebDriver{
	
	
	public FireFoxDriver() {
		System.out.println("Launching FireFox Browser");
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
