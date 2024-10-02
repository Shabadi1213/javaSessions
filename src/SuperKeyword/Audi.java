package SuperKeyword;

public class Audi extends Car {
	
	
	public Audi() {
		System.out.println("Audi Default Const...");
	}
	
	public Audi(int a) {
		super(10);
		System.out.println("Audi Const..."+ a);
		
	}
	
	public Audi(int a,int b) {
		super(40,60);
		System.out.println("Audi Const..."+ (a+b));
	}
	

}
