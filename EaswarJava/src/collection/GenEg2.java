package collection;

import java.util.LinkedList;

public class GenEg2 {

	public static void main(String[] args) {
		LinkedList<String> s = new LinkedList<String>();
		//add method
		s.add("Monday");
		s.add("Tuesday");
		s.add("Wednesday");
		s.add("Friday");
		System.out.println(s);
		
		//remove method
		
		s.remove("Friday");
		System.out.println(s);
		
		//add all method 
		
		LinkedList<String> s1 = new LinkedList<String>();
		s1.add("Thursday");
		s1.add("Friday");
		s1.add("Saturday");
		s1.add("Sunday");
		
		s.addAll(s1);
		System.out.println(s);
		
		//contains method
		
		System.out.println(s.contains("Sunday"));
		
		//get method
		
		System.out.println(s.get(2));
		
		//isempty method
		
		System.out.println("The Linked list is empty: " +s.isEmpty());
		
		//size
		System.out.println("The size of the linked list is : " +s.size());
		
	}

}
