package Abstraction;

public abstract class Page {
	
	
	public Page() {
		System.out.println("Page const default");
	}
	
	public Page(int a ) {
		System.out.println("Page const.."+ a);	
	}
	
	public Page(int a, int b ) {
		System.out.println("Page const.."+ (a+b));
	}
	
	//Abstract Methods
	public abstract void title();
	public abstract void getUrl();

	
	//Non Abstract methods
	
	public void loading() {
		System.out.println("Page Loading...in 20 secs.");
	}
	
	
}
