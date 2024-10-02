package DynamicArray;


import java.util.ArrayList;
import java.util.List;

// Type casting can be done in Arraylist
//List is the Interface and ArrayList implements the List

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> browserlist = new ArrayList<String>();
		browserlist.add("Chrome");
		browserlist.add(1, "Ravi");
	}

}
