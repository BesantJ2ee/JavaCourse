package com.besant.Chapter2.Rahul;

public class Calculator {
	
	/*
	 * void addition() { int a=10; int b=20;
	 * 
	 * int c=0;
	 * 
	 * c=a+b; System.out.println(c); }
	 */
	
	  public int subtraction()
	  {
		  int c=0;
		  int a=10;
			int b=20;
			c=a+b;
		  return c;
	  }
	  // A METHOD which is returning an array also posible
	  public int[] arrayBox() {
		
		  int a[] = {1,2,3,4};
		  
		  return a; 
	  }
	  
	// A METHOD which is returning an array also posible
		  public void arrayBox2(int a[]) {
			
			  for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
			   
		  }

}
