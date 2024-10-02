package javasessions;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(Arrays.toString(i));
		
		
		for (int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
			
		}
			
		//for each loop
		
		for (int e:i) {
			System.out.println(e);
		}

		//String Array
		String str[] = new String[4];
		str[0] = "Ravi";
		str[1] = "Kushal";
		str[2] = "Shwetha";
		str[3]="Shabadi";
		
		for (String e:str) {
			System.out.println(e);
		}
		
		
		//Char Array
		
		char ch[] = new char[5];
		ch[0]='a';
		ch[1]='6';
		ch[2]='Z';
		ch[3]='U';
		ch[4]='9';
		
		for (char e:ch) {
			System.out.println((byte)e);
		}
		
		
		
		
		//Double Array
		
		double d[] = new double[3];
		d[0] = 12.45;
		d[1] = 45.98;
		d[2] = 100;
		
		
		for (double e:d) {
			System.out.println(e);
		}
			
		System.out.println("------------------------rev---------");	
			
		int k[] = new int[4];
		k[0]=40;
		k[1]=50;
		k[2]=60;
		k[3]=70;
		
			
		for(int j=k.length-1;j>=0;j--) {
			System.out.println(k[j]);
		}
			
		
		// for each loop
		int count = k.length-1;
		for(int m:k) {
		m = count;
			System.out.println(k[m]);
			count--;

		}
		
		//Object Array
		
		Object muldata[] = new Object[4];
		muldata[0]="Ravi";
		muldata[1]= 42;
		muldata[2]=1982;
		muldata[3]="Banglore";
		
		for (Object e: muldata) {
			System.out.println(e);
		}
		
		System.out.println("----------------Array iterals--------");
		
		//Array literals
		
		int num[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(num));
		
	}

}
