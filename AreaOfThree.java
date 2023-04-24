public class AreaOfThree 
{
    public static void main(String[] args) 
{
        int rectangleLength = 10, rectangleWidth = 5;
        int squareSide = 8;

        System.out.println("Area of rectangle: " + getArea(rectangleLength, rectangleWidth));

        System.out.println("Area of square: " + getArea(squareSide));
    }


    public static int getArea(int length, int width) 
{
        int area = length * width;
        return area;
    }

    public static int getArea(int side) 
{
        int area = side * side;
        return area;
    }
}
