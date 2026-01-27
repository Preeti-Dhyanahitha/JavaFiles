public class Circle
{
    Circle(int radius)
    {
        System.out.println("Circle's Constructor with radius: " + radius);
    }
    int Area(int radius)
    {
        return (int)(3.14 * radius * radius);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);
        System.out.println("Area of Circle with radius 5: " + c1.Area(5));
        System.out.println("Area of Circle with radius 10: " + c2.Area(10));
        System.out.println("Area of Circle with radius 15: " + c3.Area(15));
    }
}