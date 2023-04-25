package com.obsqura.main;

public class Exception {
	
	int a=20;
	int b=40;
	
	public void sum() {
		
		System.out.println(a+b);
	}
	
	public void subtract() { 
		
		System.out.println(a-b);
		
		
	}
	
	public void multiply() {
		System.out.println(a*b);
	}
	
	
	public void division() {
		
		try {
			System.out.println(a/b);
			
			System.out.println(a/0);
			
		}catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			
			
		}
		finally{
			System.out.println("Must Ececute");
			
		}
		
		public static void main S
		
		
		
	
		}
	}
	 


