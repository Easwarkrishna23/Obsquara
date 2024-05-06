package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> sc = new ArrayList<String>();
		
		sc.add("Blue");
		sc.add("Green");
		sc.add("Black");
		
		Iterator<String> it = sc.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		while(it.hasNext()) {
		}
		System.out.println(sc);	

	}

}
