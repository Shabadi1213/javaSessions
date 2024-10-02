package JavaCollections;

import java.util.ArrayList;
import java.util.List;


//List Interface
public class ListInterface {

	public static void main(String[] args) {

      List<String> s = new ArrayList<String>();
      s.add("Ravi");
      s.add("Shabadi");
      s.add("Kumar");
      s.add("Kushal");
      
      
      System.out.println(s);
      System.out.println(s.size());
      
      s.set(2, "Shwetha");
      System.out.println(s);
      
      System.out.println(s.get(3));

	}

}
