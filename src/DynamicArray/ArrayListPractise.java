package DynamicArray;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();//VC=10,PC=0
		
		//Add method to add value
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
//		System.out.println(ar.size());
		
		//Remove the value from ArrayList
		
//		ar.remove(1);
//		System.out.println(ar.size());
//		System.out.println(ar);
		
		
		//Get method is used to get the value
		
//		System.out.println(ar.get(2));
//		ar.remove(1);
//		System.out.println(ar);
//		System.out.println(ar.get(0));
		
		
		//For loop to read the vales 1-1
		
		for(int i=0;i<=ar.size()-1;i++){
				System.out.println(ar.get(i));
				if(i==300) {
					System.out.println("Bye");
				}
			}
		
		
		//ArrayList with Generics
		
		// Integer
		ArrayList<Integer> numlist= new ArrayList<Integer>();//VC=10 and PC=0
		numlist.add(100);
		numlist.add(200);
		
		
		//Double 
		
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(23.00);
		d.add(35.33);
		d.add(00.05);
		
		//Boolean
		
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		b.add(true);
		b.add(false);
		b.add(null);
//		System.out.println(b);
		
		//Byte
		
		ArrayList<Byte> by = new ArrayList<Byte>();
		by.add((byte)22);
		
		
		//String 
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Selenium");
		s.add(null);
		s.add(" ");
		
		//Object
		
		ArrayList<Object> empdetails = new ArrayList<Object>();
		empdetails.add("Ravi");
		empdetails.add(42);
		empdetails.add('m');
		empdetails.add(true);
		empdetails.add(35.45);
		empdetails.remove(1);
		empdetails.add(42);
		
		empdetails.set(4, 45.20);
		
		System.out.println(empdetails);
		
		//For Each loop
		
		for(Object e : empdetails) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		}
		
	}


