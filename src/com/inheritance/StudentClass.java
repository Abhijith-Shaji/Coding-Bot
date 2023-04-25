package com.inheritance;

public class StudentClass extends info {
	
	@Override
	public void getname(String name) {
		 System.out.println(name);
	

	
		 
		 
	}
	public void getage() {
		int age=25;
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		
		
		info f = new StudentClass();
		f.getname ("Abhijith");
		f.getage();
		
		
	}

}
