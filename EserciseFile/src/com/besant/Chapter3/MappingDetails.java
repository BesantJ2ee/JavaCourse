package com.besant.Chapter3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class MappingDetails {
	
	void showMap()
	{
		Map<Integer, String > df = new HashMap<Integer, String>();
		df.put(1, "Bangalore");
		df.put(2, "Bellary");
		df.put(4, "Badami");
		df.put(7, "Bandra");
		
		for (Map.Entry<Integer, String> entry : df.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key"+key+"    Value"+val);
		}
		
		for (Integer a : df.keySet()) 
            System.out.println("key: " + a);
          
		for (String b : df.values()) 
            System.out.println("value: " + b);
		
		//Iterator
		
		 Iterator<Map.Entry<Integer, String>> itr = df.entrySet().iterator();
         
	        while(itr.hasNext())
	        {
	             Map.Entry<Integer, String> entry = itr.next();
	             System.out.println("Key = " + entry.getKey() + 
	                                 ", Value = " + entry.getValue());
	        }
		
	        
	        df.forEach((fsfs,afasfsa) -> System.out.println("Key = "
	                + fsfs + ", Value = " + afasfsa));
	        
	        
		
		
	}

}
