package com.besant.Chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_Interface_discussion {
	
	
	
	void setdetails()
	{
		Set<Integer> setaBC = new HashSet<Integer>();
		
		setaBC.add(12);
		setaBC.add(12);
		setaBC.add(13);
		setaBC.add(14);
		
		for(Integer dc: setaBC)
		{
			System.out.println(dc);
		}
		
		HashSet<Integer> setafsadBC = new HashSet<Integer>();
		setafsadBC.add(12);
		setafsadBC.add(12);
		setafsadBC.add(13);
		setafsadBC.add(14);
		for(Integer dc: setafsadBC)
		{
			System.out.println(dc);
		}
		
		TreeSet<Integer> vsd = new TreeSet<Integer>();
		vsd.add(12);
		vsd.add(12);
		vsd.add(13);
		vsd.add(14);
		
		for(Integer dc: vsd)
		{
			System.out.println(dc);
		}
		
		LinkedHashSet<Integer> vsdw = new LinkedHashSet<Integer>();
		vsdw.add(12);
		vsdw.add(12);
		vsdw.add(13);
		vsdw.add(14);
		
		
		for(Integer dc: vsdw)
		{
			System.out.println(dc);
		}
		
		
	}

	void showConversion() {
		//How to convert from List to Sort
		ArrayList<Integer> listObject11 = new ArrayList<Integer>();
		listObject11.add(10);
		listObject11.add(20);
		listObject11.add(10);
		listObject11.add(20);
		
		Set<Integer> setaABC = new HashSet<Integer>();
		setaABC.addAll(listObject11);
		 
		Set<Integer> setaABCD = new HashSet<Integer>();
		
		for(int i=0;i<listObject11.size();i++)
		{
			setaABCD.add(listObject11.get(i));
		}
		System.out.println(setaABCD);
		
		for(Integer dc: setaABC)
		{
			System.out.println(dc);
		}
		
	}
	
	
}
