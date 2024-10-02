package javasessions;

public class StackOverflow {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		m1();
	}

	public static void main(String[] args) {
		
		StackOverflow obj  = new StackOverflow();
		obj.m1();
		

	}

}
