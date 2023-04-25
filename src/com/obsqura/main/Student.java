package com.obsqura.main;

public class Student {
	 private String name;
	    private int rollNo;
	    private String collegeName;

	    public Student(String name, String collegeName, int rollno) {
	        this.name = name;
	        this.rollNo = rollno;
	        this.collegeName = collegeName;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("College Name: " + collegeName);
	        
	        
	        

}
	    
	    public static void main(String[] args) {
	    	Student student1=new Student("Abhijith",",Mar gregorios college",123);
	    	Student student2=new Student("Akhil","SD college",234);
	    	
	    	student1.display();
	    	student2.display();
	    	
			
		}
}
