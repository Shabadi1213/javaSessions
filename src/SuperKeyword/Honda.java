package SuperKeyword;

public class Honda extends Car {
	
	
	public Honda() {
		this(10);
		System.out.println("Honda Default Const...");
	}
	
	public Honda(int a) {
		this(20,60);
		System.out.println("Honda Const..."+ a);
	}
	
	public Honda(int a,int b) {
		System.out.println("Honda Const..."+ (a+b));
	}

}
