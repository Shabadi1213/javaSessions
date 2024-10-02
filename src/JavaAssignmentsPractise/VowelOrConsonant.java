package JavaAssignmentsPractise;

public class VowelOrConsonant {
	
	//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
	
	


	public static void main(String[] args) {
		
String alph = "U";
		
		switch (alph.toLowerCase().trim()) {
		case "a":
			System.out.println("Entered alphbet is an Vowel : " + 'a');
			break;
		case "e":
			System.out.println("Entered alphbet is an Vowel : " + 'e');
			break;
		case "i":
			System.out.println("Entered alphbet is an Vowel : " + 'i');
			break;
		case "o":
			System.out.println("Entered alphbet is an Vowel : " + 'o');
			break;
		case "u":
			System.out.println("Entered alphbet is an Vowel : " + 'u');
			break;
		default:
			System.out.println("Enterd alphbet is an consonant : " + alph);

	}

	
		
	}
}
