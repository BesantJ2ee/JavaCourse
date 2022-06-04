package com.besant.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
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
		System.out.println(listObject);
		for(Integer abc:listObject)
		{
			System.out.println("listObject =>"+abc);
		}
		
		ArrayList<Integer> listObject2 = new ArrayList<Integer>();
		listObject2.addAll(listObject);
		
		for(Integer abc:listObject2)
		{
			System.out.println("listObject2 =>"+abc);
		}
		
		
		
		ArrayList<Integer> listObject3 = new ArrayList<Integer>();
		listObject3.addAll(0, listObject);
		
		for(Integer abc:listObject3)
		{
			System.out.println("listObject3 =>"+abc);
		}
		
		
		
		ArrayList<Integer> listObject4 = new ArrayList<Integer>();
		listObject4.addAll(listObject);
		listObject4.remove(0);
		
		for(Integer abc:listObject4)
		{
			System.out.println("listObject4 =>"+abc);
		}
		
		ArrayList<Integer> listObject5 = new ArrayList<Integer>();
		listObject5.addAll(listObject);
		listObject4.removeAll(listObject4);
		
		for(Integer abc:listObject5)
		{
			System.out.println("listObject5 =>"+abc);
		}
		
		ArrayList<Integer> listObject6 = new ArrayList<Integer>();
		listObject6.hashCode();
		listObject6.add(6);
		listObject6.add(5);
		System.out.println("listObject6 =>"+listObject6.hashCode());
		/*
		 * for(Integer abc:listObject6) { System.out.println("listObject6 =>"+abc); }
		 */
		ArrayList<Integer> listObject7 = new ArrayList<Integer>();
		listObject7.hashCode();
		listObject7.add(6);
		listObject7.add(5);
		System.out.println("listObject6 =>"+listObject7.hashCode());
		
		if(listObject7.equals(listObject6))
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
		
		ArrayList<Integer> listObject10 = new ArrayList<Integer>();
		listObject10.add(10);
		listObject10.add(20);
		listObject10.add(30);
		
		if(listObject9.contains(listObject10))
		{
			System.out.println("listOject9 contains listOject10");
		}
		else {
			System.out.println("listOject9 not contains listOject10");
		}
		
		ArrayList<Integer> listObject11 = new ArrayList<Integer>();
		listObject11.add(10);
		listObject11.add(20);
		
		
		Object[] a = listObject11.toArray();
		
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
	    listObject12.add(896);
	    listObject12.add(-1);
	    
	    System.out.println("Before Sorting: "+ listObject12);  
	    
	    Collections.sort(listObject12);
	    
	    System.out.println("After Sorting: "+ listObject12);   
	    
	    int b[]
                = new int[] { 1, 2, 3, 4 };
	    
	    List<int[]> list = Arrays.asList(b);
	    
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
		list3Object.add("Varthuru");
		
		if(list3Object.containsAll(list2Object))
		{
			System.out.println("Contains All elements=>");	
		}
		else {
			System.out.println("Not Contains All elements=>");	
		}
		
		System.out.println(list3Object.toString()+"String");
		
		
		List<String> list5Object = new ArrayList<String>();
		list5Object.add("Bangalore");
		list5Object.add("Mumbai");
		list5Object.add("Chennai");
		
		
		
		List<String> list4Object = new ArrayList<String>();
		list4Object.add("Bangalore");
		list4Object.add("Mumbai");
		list4Object.add("Chennai");
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
		ghh.add("UttarPradesh");
		ghh.add("Maharashtra");
		ghh.add("AndhraPradesh");
		ghh.add("AndhraPradesh");
		
		
		//getting ceiling value for Karnataka
        // using ceiling() method
        String value = (ghh.ceiling("P"));

        //This method returns the least element greater than or equal to e, or null if there is no such element.
        System.out.println("Ceiling value for Karnataka: "
                           + value);
		
		for(String nffsnfs: ghh)
		{
			System.out.println(nffsnfs);
		}
	}
	
	

}
