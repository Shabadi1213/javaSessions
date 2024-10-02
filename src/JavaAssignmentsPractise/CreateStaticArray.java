package JavaAssignmentsPractise;



public class CreateStaticArray {
	
//Write a program to create a static Array, having following cricket data:name, age, team name, DOB, gender, Strike Rate
//Try to create multiple Object Arrays for different players 
//Try to print all the values of each player on the console using for and for each loops


	public static void main(String[] args) {
		
		Object str[] = new Object[6];
		str[0] = "Ravi";
		str[1] = 42;
		str[2] = "Team Shabadi";
		str[3] = 12/13/1982;
		str[4] = 'M';
		str[5] = 8.9;
		
//		System.out.println(Arrays.toString(str));

		//For each loop
//		for(Object e:str) {
//			System.out.println(e);
//		}
		
		//Index based for loop
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
		}
	}
}

