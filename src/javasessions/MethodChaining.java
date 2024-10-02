package javasessions;

public class MethodChaining {

	
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
		
	}

	public static void t1(MethodChaining p2) {
		System.out.println("t1 method");
		p2.m1();
	}

	public static void t2(MethodChaining p1) {
		System.out.println("t2 method");
		p1.m2();
	}

	public static void t3(MethodChaining p3) {
		System.out.println("t3 method");
		p3.m3();
	}
	
	
	

	public static void main(String[] args) {
		
		
		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		MethodChaining.t1(obj);
		MethodChaining.t2(obj);
		MethodChaining.t3(obj);
		
		
		
		
		

	}

}
