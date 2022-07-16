package com.besant.Chapter5.Collection.Part2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionDiscussion {
	
	void randomNumbers()
	{
		int max = 10;
        int min = 1;
        int range = max - min + 1;
 
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
 
            // Output is different everytime this code is executed
            System.out.println(rand);
        }
		
	}
	
	void enumerationExample()
	{
		Enumeration months;
        Vector<String> monthNames = new Vector<String>();
 
        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        months = monthNames.elements();
 
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }

	}
	
	void queuDetails() {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		//System.out.println("head:"+queue.element());  
		//System.out.println("head:"+queue.peek());  
		//System.out.println("iterating the queue elements:");  
		 
		//queue.remove(); 
		//System.out.println(" Executing Queu Remove");  
		//queue.poll();  
		//System.out.println("Executing Poll");  
		//Iterator itr=queue.iterator();  
		//while(itr.hasNext()){  
		//System.out.println(itr.next());  
		//} 
		
		System.out.println("QueuPeak"+queue.peek());
		System.out.println("QueuPoll"+queue.poll());
		System.out.println("QueuPoll"+queue.remove());
		Iterator itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}
		//Iterator<String> itr2=queue.iterator();  
		//while(itr2.hasNext()){  
		//System.out.println(itr2.next());  
		//}  
		  
	}

}
