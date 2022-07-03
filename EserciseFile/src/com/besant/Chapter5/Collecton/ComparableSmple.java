package com.besant.Chapter5.Collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableSmple  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ArrayList<Integer> vb = new ArrayList<Integer>();
		vb.add(10);
		vb.add(20);
		vb.add(30);
		vb.add(400);
		vb.add(50);
		vb.add(50);
		//Collections.sort(vb); aSCENDKING ORDER
		vb.sort(Comparator.reverseOrder());
		//vb.sort(Comparator.naturalOrder());
		vb.forEach(System.out::println);
		
		

	}


	
		
	

}
