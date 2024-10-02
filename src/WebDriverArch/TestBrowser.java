package WebDriverArch;

public class TestBrowser {

	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();
//		FireFoxDriver driver = new FireFoxDriver();
//		SafariDriver driver = new SafariDriver();
//		
	

		
		String browserName = "Chrome";
		WebDriver driver = null;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FireFoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass correct browser name "+ browserName);
		}
		
		driver.getUrl("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.sendKeys("SearchField", "Java with Selenium");
		driver.click("SearchButton");
		driver.close();
	}

}
