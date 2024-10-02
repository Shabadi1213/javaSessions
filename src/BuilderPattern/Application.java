package BuilderPattern;

public class Application {
	
	
	public Application login() {
		System.out.println("App Login");
		return this;
	}
	
	public Application login(String userName,String password) {
		System.out.println("Login with 'Username': "+ userName+ " 'Password' : "+ " " + password);
		return this;
	}
	
	public Application search(String productName) {
		System.out.println("Searching the product " + productName);
		return this;
	}
	
	public Application search(String productName,int price) {
		System.out.println("Searching the Product " + productName + " "+"Price :" + price);
		return this;
	}
	
	public Application addToCart(String productName) {
		System.out.println("Adding to cart :" + productName);
		return this;
	}
	
	public Application doPayment(String UPI) {
		System.out.println("Payment through UPI "+ UPI);
		return this;
	}
	
	public Application doPayment(String cc,int CVV) {
		System.out.println("Payment through CC "+ cc + "CVV "+ CVV);
		return this;
		
	}
	
	public Application genrateOrder() {
		System.out.println("Generationg the purchase order");
		return this;
	}
	
	public Application logout() {
		System.out.println("Logging out...Byeee");
		return this;
	}

}
