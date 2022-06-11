package com.besant.Chapter2.Venkatesh;

public class MainMethodExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BesantStudent vbnnn= new BesantStudent();
		vbnnn.setStudentsName("Rahul");
		vbnnn.setClasshour(2);
		vbnnn.setCompanyName("Techniclor");
		vbnnn.setStudentAge(25);
		vbnnn.setNameNotebook("Clasmateds");
		
		BesantStudent vbnnnfsfds= new BesantStudent();
		vbnnnfsfds.setStudentsName("Venkatesh");
		vbnnnfsfds.setClasshour(2);
		vbnnnfsfds.setCompanyName("Airforce");
		vbnnnfsfds.setStudentAge(25);
		vbnnn.setNameNotebook("Viva");
		
		System.out.println(vbnnn.getStudentsName());
		System.out.println(vbnnn.getStudentAge());
		System.out.println(vbnnnfsfds.getStudentsName());
		
	}

}
