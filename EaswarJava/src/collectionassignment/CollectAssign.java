package collectionassignment;

import java.util.ArrayList;

public class CollectAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		
		int i;
		
		s.add("Violet");
		s.add("Indigo");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		s.add("Yellow");
		s.add("Orange");
		s.add("Red");
		
		System.out.println(s);
		
		//Retrieve an element(at index 4)
		
		System.out.println();
		System.out.println("Element retrieved is : " +s.get(4));
		
		System.out.println();
		
		//iterate through all elements in array list.
		
		System.out.println("Iterate through the ArrayList : ");
		for(i=0;i<(s.size()-1);i++)
		{
			System.out.println(s.get(i));
		}
		
		//remove the third Element from the list.
		
		s.remove(3);
		System.out.println(s);
		
		//search an element in the Array
		
		System.out.println("Is Green Present in the Array List : " +s.contains("Green"));
		
	}

}
