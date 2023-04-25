package com.inheritance;

public class Apple extends Fruits{
	
	public Apple() {
		System.out.println("Child class constructor"+ Apple.varient);
		
	}
	public void show() {
		System.out.println("Cost:"+cost);
		
	}
	
	public static void main(String args[]) {
		Apple ap = new Apple();
		ap.getname();
		ap.show();
	}
	

}
