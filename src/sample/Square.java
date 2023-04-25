package sample;

import java.util.Scanner;

public class Square {
	
	public int calculateArea(int side) {
		
		return side*side;
		
	}
	
	
	
	public static int getside() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side:");
		int side = sc.nextInt();
		return side;
		
	}
}
