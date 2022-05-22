package com.besant.Chapter2;

public class Exercise_CommandLineArgument_Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your first argument is: "+args[0]); 
		
		///ADDING AARAY AS RUNTIME ARGUMENTS
		int[] aray = new int[args.length];
		
		for(int i=0;i<args.length;i++)  {
			aray[i]=Integer. parseInt(args[i]);
			System.out.println("Comand line arfument"+aray[i]);  
			}  
	}

}
