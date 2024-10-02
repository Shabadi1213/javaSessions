package JavaAssignmentsPractise;

public class PrintAllVowelsa2z {

	
	//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
	
	//For loop
//	public void getAllVowles(char k) {
//		for(char i ='a';i<= k;i++) {
//			if(i=='a'||i=='e' ||i=='i'||i=='o'||i=='u') {
//				System.out.println(i);
//				
//			}
//		}
//	}
	
	
	//While loop
	public void findAllVowles(char n) {
		char j = 'a';
		while(j<=n) {
			if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u') {
				System.out.println(j);
			}j++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		PrintAllVowelsa2z obj = new PrintAllVowelsa2z();
		//For loop
//		obj.getAllVowles('z');

		
		//While loop
		
		obj.findAllVowles('z');
	}

}
