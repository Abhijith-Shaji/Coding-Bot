package com.obsqura.main;

public interface Interface1 { 
	void display();
}

interface Interface2 {
    void display();
}

class ChildClass implements Interface1, Interface2 {
    public void display() {
        System.out.println("Hello");
    }
}


