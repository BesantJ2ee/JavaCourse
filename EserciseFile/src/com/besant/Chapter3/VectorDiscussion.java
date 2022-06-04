package com.besant.Chapter3;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDiscussion {
	
	void show()
	{
		Vector<Integer> cv = new Vector<Integer>();
		cv.add(12);
		
		cv.add(15);
		cv.add(13);
		cv.add(14);
		cv.add(null);
	cv.add(12);
		
		cv.add(15);
		cv.add(13);
		cv.add(14);
		cv.add(null);
	cv.add(12);
		
		cv.add(15);
		cv.add(13);
		cv.add(14);
		cv.add(null);
		
		
		
		System.out.println("Capacity"+cv.capacity());
		for(Integer df:cv)
		{
			System.out.println(df);
		}
		
		
		if(cv.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Not Empty");
		}
		
		 ListIterator<Integer> listIterator
         = cv.listIterator();

     // Traversing elements
     System.out.println("Forward Direction Iteration:");
     while (listIterator.hasNext()) {
         System.out.println(listIterator.next());
     }

     // Traversing elements, the iterator is at the end
     // at this point
     System.out.println("Backward Direction Iteration:");
     while (listIterator.hasPrevious()) {
         System.out.println(listIterator.previous());
     }
		
		
	}
	
	
	

}
