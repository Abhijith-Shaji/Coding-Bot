import java.util.Scanner;

class Shape {
    double length;
    double breadth;
    double area;

    Shape(double l, double b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    Shape(float s) {
        length = breadth = s;
        area = length * breadth;
    }

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

public class AreaOfFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter shape type (1 = Rectangle, 2 = Square): ");
        int shapeType = input.nextInt();

        switch (shapeType) {
            case 1:
                System.out.print("Enter length of rectangle: ");
                double length = input.nextDouble();

                System.out.print("Enter breadth of rectangle: ");
                double breadth = input.nextDouble();

                Shape rectangle = new Shape(length, breadth);
                rectangle.displayArea();
                break;

            case 2:
                System.out.print("Enter side of square: ");
                float side = input.nextFloat();

                Shape square = new Shape(side);
                square.displayArea();
                break;

            default:
                System.out.println("Invalid shape type");
                break;
        }

        input.close();
    }
}

