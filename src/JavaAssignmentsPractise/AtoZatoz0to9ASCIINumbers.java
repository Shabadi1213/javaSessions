package JavaAssignmentsPractise;

public class AtoZatoz0to9ASCIINumbers {
	
//	// Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
	
	//For loop
	public void getAsciiNumbers(char n) {
		for(char i = '0';i<=n;i++) {
			System.out.println(i +" Ascii value = " + (byte)i);
		}

	}

	
	//While loop
	public void AsciiNumber(char a) {
		char i = '0';
		while(i<= a) {
			System.out.println( i + " Ascii value is " + (byte)i);
			i++;
		}
	}
	
	public static void main(String[] args) {
	
		AtoZatoz0to9ASCIINumbers obj = new AtoZatoz0to9ASCIINumbers();
		obj.getAsciiNumbers('z');
	
//		//While loop
		
		obj.AsciiNumber('9');
	

	}

}
