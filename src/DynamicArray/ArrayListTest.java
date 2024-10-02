package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList ar = new ArrayList();
//		ar.add(100);
//		ar.add(200);
//		ar.add("Selenium");
//		ar.add(null);
//		ar.add("null");
//		ar.add(" ");
//		ar.add("");
//		ar.add('D');
//		ar.add("LifeIstene");
////		System.out.println(ar);
//		
//		System.out.println(ar.size());
//		
//		
//		ArrayList ar1 = new ArrayList(10);
//		ar1.add(23);
//		ar1.addAll(0, ar);
//		ar1.add(3, "Ravi");
//		ar1.clear();
//		ar1.addAll(ar);
//		
////		System.out.println(ar.size());
//		System.out.println(ar);
//		System.out.println(ar1);
//		System.out.println(ar.equals(ar1));
//		
//		System.out.println(ar1.contains("Selenium"));
//		System.out.println(ar1.containsAll(ar));
//		System.out.println(ar.toArray());
//		System.out.println(ar);
		
//		ArrayList<String> clonelist = (ArrayList <String>)ar1.clone();
//		System.out.println(clonelist);
//		System.out.println(ar.indexOf("LifeIstene")>0);
//		
//		
//		
//		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("Ravi","Shabadi","Kushal","Shwetha","Ravi"));
//         System.out.println(ar4); 
//         int l = ar4.lastIndexOf("Ravi");
//         System.out.println(l);
		
		// Removeif method
		ArrayList<Integer> nu = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		nu.removeIf(num -> num%2!=0);
		System.out.println(nu);
		
		
		//RetainAll method
		
		ArrayList<String> S2 = new ArrayList<String>(Arrays.asList("Ravi","Java","Selenium","Python","Ravi"));
		S2.retainAll(Collections.singletonList("Ravi"));
//		S2.retainAll(Collections.si)
		System.out.println(S2);
		
		
		HashMap<String,Integer> Map = new HashMap<String,Integer>();
		Map.put("Ravi", 42);
		Map.put("DoorNo", 203);
		Map.put("Ravi", 43);
		
		
		System.out.println(Map.get("DoorNo"));
		
		//Creating Sub List
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		System.out.println(num);
		
		ArrayList<Integer> Sublist = new ArrayList<Integer>(num.subList(2, 12));
		System.out.println(Sublist);
		
		//toArray
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Ravi","Java","Selenium","Python","Ravi"));
		System.out.println(newList);
		Object arr [] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object ob:arr) {
			System.out.println((String)ob);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
