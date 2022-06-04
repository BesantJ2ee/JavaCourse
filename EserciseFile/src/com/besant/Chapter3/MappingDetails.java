package com.besant.Chapter3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

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
	
	void showOtherMap()
	{
	Hashtable<Integer, String > df = new Hashtable<Integer, String>();	
	df.put(1, "Bangalore");
	df.put(2, "Bellary");
	df.put(4, "Badami");
	df.put(7, "Bandra");
	
	 df.forEach((fsfs,afasfsa) -> System.out.println("Key = "
             + fsfs + ", Value = " + afasfsa));
	
	 TreeMap<Integer, String > dfq = new TreeMap<Integer, String>();
	 
	 dfq.put(1, "Bangalore");
	 dfq.put(2, "Bellary");
	 dfq.put(4, "Badami");
	 dfq.put(7, "Bandra");
	 
	 dfq.forEach((fsfs,afasfsa) -> System.out.println("Key = "
             + fsfs + ", Value = " + afasfsa));
	 
	 SortedMap<Integer, String > dfqfa = new TreeMap<Integer, String>();
	 dfqfa.put(1, "Bangalore");
	 dfqfa.put(2, "Bellary");
	 dfqfa.put(4, "Badami");
	 dfqfa.put(7, "Bandra");
	 
	 dfqfa.forEach((fsfs,afasfsa) -> System.out.println("Key = "
             + fsfs + ", Value = " + afasfsa));
	 
	 LinkedHashMap<Integer, String > dfqfacsdc = new LinkedHashMap<Integer, String>();
	 dfqfacsdc.put(1, "Bangalore");
	 dfqfacsdc.put(2, "Bellary");
	 dfqfacsdc.put(4, "Badami");
	 dfqfacsdc.put(7, "Bandra");
	 
	 dfqfacsdc.forEach((fsfs,afasfsa) -> System.out.println("Key = "
             + fsfs + ", Value = " + afasfsa));
	}
	
	

}
