package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> s = new ArrayList<String>();
		s.add("Devi");
		s.add("Easwar");
		s.add("Veena");
		s.add("Harish");
		s.add("Devi");
		System.out.println(s);
		// to change the value of index 1 to another value.
		s.set(1, "Adarsh");
		System.out.println(s);
		
		//To get the first index where the value "Devi" is stored.
		
		int index = s.indexOf("Devi");
		System.out.println(index);
		
		//To get the last index where the value "Devi" is stored.
		
		int ind = s.lastIndexOf("Devi");
		System.out.println(ind);
		
		//To remove a value from the list
		
		//using value
		s.remove("Adarsh");
		System.out.println(s);
		//using index value
		s.remove(3);
		System.out.println(s);
		
		//Get Method 
		
		String obj = s.get(2);
		System.out.println(obj);
		
		System.out.println(s.get(1));
		
		//Contains method
		
		boolean b = s.contains("Devi"); 
		System.out.println(b);
		
		boolean c = s.contains("Asif");
		System.out.println(c);

	}

}
