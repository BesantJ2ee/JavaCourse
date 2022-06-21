package com.besant.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class listDiscussion {
	
	void list()
	
	{
		ArrayList<Integer> listObject = new ArrayList<Integer>();
		
		listObject.add(12);
		listObject.add(13);
		listObject.add(2, null);
		listObject.add(3, 3);
		listObject.add(4, 3);
		
		System.out.println("<<<<<<<<<<1>>>>>>>>>>>>");
		
		System.out.println(listObject);
		
		System.out.println("<<<<<<<<<<2>>>>>>>>>>>>");
		for(Integer abc:listObject)
		{
			System.out.println("listObject =>"+abc);
		}
		
		
		
		System.out.println("<<<<<<<<<<3>>>>>>>>>>>>");
		ArrayList<Integer> listObject2 = new ArrayList<Integer>();	
		listObject2.addAll(listObject);
		
		for(Integer abc:listObject2)
		{
			System.out.println("listObject2 =>"+abc);
		}
		
		System.out.println("<<<<<<<<<<4>>>>>>>>>>>>");
		
		ArrayList<Integer> listObject3 = new ArrayList<Integer>();
		listObject3.addAll(0, listObject2);
		
		for(Integer abc:listObject3)
		{
			System.out.println("listObject3 =>"+abc);
		}
		
		System.out.println("<<<<<<<<<<5>>>>>>>>>>>>");
		
		ArrayList<Integer> listObject4 = new ArrayList<Integer>();
		listObject4.addAll(listObject);
		listObject4.remove(0);
		
		for(Integer abc:listObject4)
		{
			System.out.println("listObject4 =>"+abc);
		}
		
		System.out.println("<<<<<<<<<<6>>>>>>>>>>>>");
		ArrayList<Integer> listObject5 = new ArrayList<Integer>();
		listObject5.addAll(listObject);
		System.out.println(listObject5);
		
		
		listObject5.removeAll(listObject5);
		
		for(Integer abc:listObject5)
		{
			System.out.println("listObject5 =>"+abc);
		}
		
		System.out.println("<<<<<<<<<<7>>>>>>>>>>>>");
		
		ArrayList<Integer> listObject6 = new ArrayList<Integer>();
		listObject6.add(6);
		listObject6.add(5);
		listObject6.add(6);
		listObject6.add(null);
		listObject6.hashCode();
		
		ArrayList<Integer> listObject15 = new ArrayList<Integer>();
		listObject15.add(6);
		listObject15.add(5);
		listObject15.add(6);
		listObject15.add(null);
		listObject15.hashCode();
		
		System.out.println("listObject6 Hashcode =>"+listObject6.hashCode());
		System.out.println("listObject12 Hashcode =>"+listObject15.hashCode());
		/*
		 * for(Integer abc:listObject6) { System.out.println("listObject6 =>"+abc); }
		 */
		
		System.out.println("<<<<<<<<<8>>>>>>>>>>>>");
		
		ArrayList<Integer> listObject7 = new ArrayList<Integer>();
		listObject7.hashCode();
		listObject7.add(6);
		listObject7.add(5);
		System.out.println("listObject6 =>"+listObject7.hashCode());
		
		if(listObject6.equals(listObject15))
		{
			System.out.println("Both objects hash code are equal");
		}
		else {
			System.out.println("Both objects hash code are not equal");
		}
		
		System.out.println("Before Clear Method =>");
		for(Integer abc:listObject7) { System.out.println("listObject7 =>"+abc); }
		listObject7.clear();
		System.out.println("After Clear Method =>");
		for(Integer abc:listObject7) { System.out.println("listObject7 =>"+abc); }
		
		
		ArrayList<Integer> listObject9 = new ArrayList<Integer>();
		listObject9.add(10);
		listObject9.add(20);
		listObject9.add(30);
		
		
		ArrayList<Integer> listObject10 = new ArrayList<Integer>();
		listObject10.add(10);
		listObject10.add(20);
		listObject10.add(30);
		
		if(listObject10.contains(40))
		{
			System.out.println("listOject9 contains listOject10");
		}
		else {
System.out.println("listOject9 not contains listOject10"+"Hashcode of 9");
		}
		
		ArrayList<Integer> listObject11 = new ArrayList<Integer>();
		listObject11.add(10);
		listObject11.add(20);
		
		
		Object[] a = listObject11.toArray();
		
		int acvf[]= {1,2,3,3};
		
		System.out.println("Object a Array"+a);
		
		System.out.println("int  a Array"+acvf);
		
		String c[] = new String[2];
		
		for(int i=0;i<a.length;i++)
		{
			
			c[i]=a[i].toString();
			
		}
	    for(String kgf:c)
	    {
	    	System.out.println(kgf);	
	    }
	    
	    ArrayList<Integer> listObject12 = new ArrayList<Integer>();
	    listObject12.add(20);
	    listObject12.add(5);
	    listObject12.add(-1);
	    
	    System.out.println("Before Sorting: "+ listObject12);  
	    
	    Collections.sort(listObject12);
	    
	    System.out.println("After Sorting: "+ listObject12);   
	    
	    int b[]
                = new int[] { 1, 2, 3, 4 };
	    
	    List<int[]> list = Arrays.asList(b);
	    
	    
	    String asb[] = {"as","bn"};
	    
	    System.out.println(list);
	    
	    List<String> list2 = Arrays.asList(asb);
	    
	    System.out.println(list2);
	    
	}
	
	
	void listTwo()
	{
		List<String> list2Object = new ArrayList<String>();
		list2Object.add("Marthahalli");
		list2Object.add("Sarjapura");
		list2Object.add("Varthuru");
		
		System.out.println(list2Object.get(2));
		
		List<String> list3Object = new ArrayList<String>();
		list3Object.add("Marthahalli");
		list3Object.add("Sarjapura");
		list2Object.add("Varthuru");
		
		if(list3Object.containsAll(list2Object))
		{
			System.out.println("Contains All elements=>");	
		}
		else {
			System.out.println("Not Contains All elements=>");	
		}
		
		System.out.println(list3Object.toString()+"String");
		
		System.out.println(list3Object.toString()+"String");
		
		
		List<String> list5Object = new ArrayList<String>();
		list5Object.add("Bangalore");
		list5Object.add("Mumbai");
		list5Object.add("Chennai");
				
		List<String> list4Object = new ArrayList<String>();
		list4Object.add("Bangalore");
		list4Object.add("Mumbai");
		list4Object.add("Agra");
		
		list5Object.retainAll(list4Object);
		
		System.out.println("/////Retains");
		for(String nffsnfs: list5Object)
		{
			System.out.println(nffsnfs);
		}
		System.out.println("/////Retains");
		for(String nffsnfs: list4Object)
		{
			System.out.println(nffsnfs);
		}
		
		String b[]
                = new String[] { "A", "B", "C", "D" };
		
		List<String> list = Arrays.asList(b);
		
		System.out.println("The list is: " + list);
		
		
		
	}
	
	
	void linkedListDiscussion() {
		LinkedList<String> ghh = new LinkedList<String>();
		ghh.add("Karnataka");
		ghh.add("Punjab");
		ghh.add("UttarPradesh");
		ghh.add("Maharashtra");
		ghh.add("AndhraPradesh");
		ghh.add("AndhraPradesh");
		
		for(String nffsnfs: ghh)
		{
			System.out.println(nffsnfs);
		}
	}
	
	void linkedHahSetDiscussion() {
		LinkedHashSet<String> ghh = new LinkedHashSet<String>();
		ghh.add("Karnataka");
		ghh.add("Punjab");
		ghh.add("UttarPradesh");
		ghh.add("Maharashtra");
		ghh.add("AndhraPradesh");
		ghh.add("AndhraPradesh");
		
		
		for(String nffsnfs: ghh)
		{
			System.out.println(nffsnfs);
		}
	}
	
	void linkedTreeSetDiscussion() {
		TreeSet<String> ghh = new TreeSet<String>();
		ghh.add("Punjab");
		ghh.add("Pondicherry");
		ghh.add("Karnataka");
		ghh.add("Kerala");
		ghh.add("Karnatakas");
		ghh.add("UttarPradesh");
		ghh.add("Maharashtra");
		ghh.add("AndhraPradesh");
		ghh.add("AndhraPradesh");
		
		
		//getting ceiling value for Karnataka
        // using ceiling() method
        String value = (ghh.ceiling("K"));

        //This method returns the least element greater than or equal to e, or null if there is no such element.
        System.out.println("Ceiling value for a: "
                           + value);
		
		for(String nffsnfs: ghh)
		{
			System.out.println(nffsnfs);
		}
		
		
		
		
		
		
	}
	
	
	void carparking()
	{
		
		/*
		 * Raju = Holding (Physics, chemistry, Biology) 
		 * Reshma = Holding (IT, Maths,
		 * eNGLISH) 
		 * lAXMAN = Holding (BOTANY, Engineering, Biology) 
		 * SOORYA = Holding
		 * (communiucaton, graphics, history)
		 */
	      ArrayList<String> holdingRaju = new ArrayList<String>();
		 holdingRaju.add("Physics");
		 holdingRaju.add("Chemistry");
		 holdingRaju.add("Biology");
		 
		 ArrayList<String> holdingReshma = new ArrayList<String>();
		 holdingRaju.add("IT");
		 holdingRaju.add("Maths");
		 holdingRaju.add("English");
		 
		
		Map< ArrayList<String>, ArrayList<String>> df56 = new HashMap< ArrayList<String>, ArrayList<String>>();
		 df56.put(holdingReshma, holdingRaju);
		
		 Map<String, ArrayList<String>> df57 = new HashMap< String, ArrayList<String>>();
		 df57.put("Reshma", holdingReshma);
		
		
		
		
		
		
		
		
		
		LinkedList<String> carpar = new LinkedList<String>();
		carpar.add("UP01-AB-4590");
		carpar.add("KA03-NK-4890");
		
		
		Map<String, String> df = new HashMap<String, String>();
		df.put("UP01-AB-4590", "Bike");
		df.put("KA03-NK-4890", "Car");
		df.put("UP02-AB-4690", "Truck");
		df.put("AP01-AB-4590", "Bike");
		df.put("JH03-NK-4890", "Car");
		df.put("GA02-AB-4690", "Truck");
		
		
		 for (Map.Entry<String, String> entry : df.entrySet()) 
		 { 
			 
			 if(entry.getValue().equalsIgnoreCase("Bike"))
			 {
				 String keyType = entry.getKey(); 
				 System.out.println("Check All the Bike numbers "+keyType);
			 }
			 
			 
		 }
		 
		
		
			/*
			 * for (String a : df.keySet()) System.out.println("key: "+a);
			 * 
			 * for (String b : df.values()) System.out.println("value: "+b );
			 */
		
		
		
		/*
		 * for (Map.Entry<String, String> GDDNNFG : df.entrySet()) {
		 * 
		 * 
		 * 
		 * String key = GDDNNFG.getKey(); String val = GDDNNFG.getValue();
		 * System.out.println("Key "+key+"    Value "+val); }
		 */
		
		
		
		Map<Integer, String> df1 = new HashMap<Integer, String>();
		df1.put(1, "Bike");
		df1.put(2, "Car");
		df1.put(3, "Truck");
		df1.put(4, "Car");
		df1.put(4, "Carfg");
		df1.put(null, "Carfg");
		
		HashMap<Integer, String> df5 = new HashMap<Integer, String>();
		df5.put(1, "Bike");
		df5.put(2, "Car");
		df5.put(3, "Truck");
		df5.put(4, "Car");
		df5.put(null, "Carfg");
		df5.put(null, "rt");
		
		
	
	}
	

}
