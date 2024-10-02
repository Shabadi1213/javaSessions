package JavaAssignmentsPractise;

public class ReverseAphbaZToA {
	//Reverse Alphabet Series: Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to 'a'.
	
	public void printReverseAlphbetsZtoA(char a) {
		for(char i=a;i>='A';i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ReverseAphbaZToA obj = new ReverseAphbaZToA();
		obj.printReverseAlphbetsZtoA('Z');

	}

}
