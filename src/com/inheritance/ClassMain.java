package com.inheritance;

public class ClassMain implements Printable,Display {
	
	@Override
	public void print() {
		System.out.println("printable");
		System.out.println(Printable.c);
	}
	
	public static void main(String[] args) {
		
		Printable p = new ClassMain();
		p.print();
		p.show();7
		
	
		
	}

}
