package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		//User defined custom exception/Our own exception
		
		String name = null;
		
		if (name==null) {
		throw new RuntimeException("DATANOTFOUND");
		}

	}

}
