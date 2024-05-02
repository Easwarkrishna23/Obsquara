package collection;

import java.util.ArrayList;

public class GenEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		s.add("Adarsh");
		s.add("Asif");
		s.add("Devi");
		s.add("Easwar");
		s.add(4, "Anand");
		System.out.println(s);
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Oldest");
		s1.add("Friend");
		s1.add("Sibling");
		s1.add("Myself");
		
		//Addall method ...merge 2 arrayists
		
		s.addAll(s1);
		System.out.println(s);
		
		//contains method
		
		System.out.println(s.contains("Anand"));
		System.out.println(s.contains("Unni"));
		
		//get method
		
		System.out.println(s.get(4));
		
		//isempty method - to check if the list is empty.
		
		boolean a = s.isEmpty();
		System.out.println(a);
		
		//remove method
		
		s.remove(2);
		System.out.println(s);
		
		//size - to get the number of elements.
		
		System.out.println(s.size());
		
		
		
	}

}
