package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		
		//add method-Last added method will be in the first index.
		
		s.add("Mercury");
		s.add("Venus");
		s.add("Earth");
		s.add("Jupiter");
		s.add("Mars");
		
		System.out.println(s);
		
		
		//remove method;
		
		s.remove("Jupiter");
		System.out.println(s);
		
		//add all method
		
		Set<String> s1 = new HashSet<String>();
		s1.add("Jupiter");
		s1.add("Uranus");
		s1.add("Neptune");
		
		s.addAll(s1);
		System.out.println(s);
		
		//isempty
		System.out.println("Is the set empty: "+s.isEmpty());
		
		//contains method
		
		System.out.println( "Set contains 'Earth' : " +s.contains("Earth"));
		
		//size
		
		System.out.println(s.size());
		
		
	

	}

}
