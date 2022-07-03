package com.besant.Chapter5.Collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ChapterProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it has size 
		//it will maintain insertion order
		ArrayList<Integer > list= new ArrayList<Integer>();  
		list.add(8);
		list.add(10);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(48);
		list.add(6);
		//list.forEach(System.out::println);
		
		 
		//it will not maintain insertion order
		//it removes the duplicate 
		Set<Integer> hg1 = new HashSet<Integer>();
		hg1.addAll(list);
		//hg1.forEach(System.out::println);
		
		
		//it will maintain insertion order
		//it removes the duplicate 
		LinkedHashSet<Integer> hg = new LinkedHashSet<Integer>();
		hg.addAll(list);
		///hg.forEach(System.out::println);
		
		//it will not maintain insertion order
		//Removed the duplicate
		//it will sort based on natural sequence order
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.addAll(list);
		//tree.forEach(System.out::println);
	 
		//Ascending order
		//Minmumm value , get(0), first element
		//Maximum value , get(n), last element
		
		// descending order
		//Minmumm value , get(0), last element
	    //Maximum value , get(n), first element
		
		//IT will not maontain insertion order
		//it will print duplicate value also
	    //it will print natural sequence order
		Collections.sort(list);		
		
		for(Integer fc:list)
		{
			System.out.println(fc);
		}
	
		//Descending order 
		
		
		
		
		
		

	}

}
