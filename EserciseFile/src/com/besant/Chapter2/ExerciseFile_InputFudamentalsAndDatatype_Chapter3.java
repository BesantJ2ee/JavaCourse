package com.besant.Chapter2;

import java.util.Scanner;

public class ExerciseFile_InputFudamentalsAndDatatype_Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Scanner
		
		Scanner  scannerObject = new Scanner(System.in);
		System.out.println("Enter name, age and salary:");
		
		
		String name = scannerObject.nextLine();
		int age = scannerObject.nextInt();
		 double salary = scannerObject.nextDouble();
		
	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
	    
	 // 
	}

}
