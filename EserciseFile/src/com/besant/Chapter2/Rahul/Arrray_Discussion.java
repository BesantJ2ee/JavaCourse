package com.besant.Chapter2.Rahul;

public class Arrray_Discussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] a= {1,2,5,8,1};
		
		int[] b= {3,2,6,8,7};
		
		//String array
		
		
		String[]  k= {"Abv","ssf","fsnsdnkcs"};	
		
		String abc1=null;
		String employee="besant";
		
		String[]  k1= {"wipro","besant","cts"};	
		
		/*
		 * for(int i=0;i<k1.length;i++) { if(employee.contains(k1[i])) {
		 * System.out.println("The company name is ="+k1[i]+"Contains Method"); } }
		 */
		
		/*
		 * for(int i=0;i<k1.length;i++) { if(employee.equalsIgnoreCase(k1[i])) {
		 * System.out.println("The company name is ="+k1[i]+"Equalsignorecase method");
		 * }else { System.out.println("The company name is not availble in the list"); }
		 * }
		 */
		
		
		char[] charter = {'B','O','X'};
		
		String xv = null;
		String y = null;
		String z = null;
		char abx = 'c';
		
		Character xchar = 'h';
		
		Character ychar = 'b';
		Character zchar = 'g';
		
		
		//Sop
		
		for(int i=0;i<charter.length;i++)
		{
		if(charter[i]=='B')
		{
		xchar=  charter[i];	
		}
		if(charter[i]=='O')
		{
			ychar=charter[i];	
		}
		if(charter[i]=='X')
		{
			zchar=charter[i];	
		}		
		}
		System.out.println("the out put is= "+xchar.toString()+ychar.toString()+zchar.toString());
	}

	//the out put is =BOX
	
	//Option a  wiprobesantcts
	//Option b  wipro besant cts
	//Option c  wipro 
	//Option d  null
	//Option e  cts
	
}
