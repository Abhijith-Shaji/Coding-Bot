package sample;

public class Circle {
	String s;
	
	 public static void main(String args[])
	 {
		 Square s = new Square();
		 int radius = Square.getSide();
		 int sqArea = s.calculateArea(radius);
		 System.out.println("Area of square:" +sqArea);
		 double circleArea=3.14 * sqArea;
		 System.out.println("Area of circle:" +circleArea);
		 
	 }
	 

}
