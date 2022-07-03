package com.besant.Chapter5.Collecton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> csmtcndn=Arrays.asList(60,100,50,120,40,32,30);
		
		ArrayList<Integer> csmt = new ArrayList<Integer>();
		csmt.add(60);
		csmt.add(100);
		csmt.add(50);
		csmt.add(120);
		csmt.add(40);
		csmt.add(32);
		csmt.add(30);
		csmt.add(20);
		csmt.add(20);
		
		
		List<Integer> cv=csmt.stream().filter(x->x<35).map(x->(x+5)).collect(Collectors.toList());
		cv.forEach(System.out::println);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
		csmt.stream().filter(x->x<35).map(x->(x+5)).forEach(System.out::println);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
		List<Integer> cvB=csmt.stream().distinct().filter(x->x<35).map(x->(x+5)).collect(Collectors.toList());
		cvB.forEach(System.out::println);
		
	}

}
