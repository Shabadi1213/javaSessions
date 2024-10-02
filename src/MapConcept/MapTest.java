package MapConcept;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String,Integer> Map = new HashMap<String,Integer>();
		Map.put("Ravi", 42);
		Map.put("Salary",40);
		Map.put("Address", null);
		Map.put(null, null);
		Map.put("age",42);
		
		System.out.println(Map);
		
		
		HashMap<Integer,Integer> Map1 = new HashMap<Integer,Integer>();
		Map1.put(1, 100);
		Map1.put(2,200);
		Map1.put(null, null);
		
		System.out.println(Map1);

		
		
		HashMap<String,Object> data = new HashMap<String,Object>();
		
		data.put("Name", "Ravi");
		data.put("Age", 42);
		data.put("Salary", 42.35);
		data.put("isPerm", true);
		data.put("address",null );
		data.put(null, "company");
		data.put(null, null);
		data.put(" ", " ");
		data.put(null, "updated");
		
		System.out.println(data);
		
		System.out.println(data.get("isPerm"));
		System.out.println(data.get("Salary"));
		System.out.println(data.get(null));
		System.out.println(data.get("Name"));
		
	}

}
