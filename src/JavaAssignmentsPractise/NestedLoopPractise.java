package JavaAssignmentsPractise;

public class NestedLoopPractise {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		System.out.println("=============================break===========================");
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				for(int k=0;k<=5;k++) {
					System.out.print(i+""+j+""+k+" ");
				}
				
				System.out.println();
			}
			
		}
		
		
		
		
		
	}

}
