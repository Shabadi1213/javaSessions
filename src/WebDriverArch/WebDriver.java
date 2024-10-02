package WebDriverArch;

public interface WebDriver {
	
	public String getTitle();
	
	public void getUrl(String Url);
	
	public void close();
	
	public void sendKeys(String element,String value);
	
	public void click(String element);

}
