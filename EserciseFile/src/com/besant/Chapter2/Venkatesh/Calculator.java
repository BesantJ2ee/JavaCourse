package com.besant.Chapter2.Venkatesh;

public class Calculator {
	public void addition()
	{
		int a=10;
		int b=20;
		int c=0;		
		c=a+b;
		System.out.println(c);
		}	
	public int multiplication()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a*b;
		return c;
		}	
	public int calculation(int p, int c) {
	     
		int k=0;
		int a=10;
		k=a+p+c;
		System.out.println(k);
		return k;
	}	
	public void concatenation(char x, int m, String xc)
	{
		String c="Rupees";
		System.out.println("Sum is  "+m+c+xc);
		System.out.println("Character"+x);
	}
	
	
}
