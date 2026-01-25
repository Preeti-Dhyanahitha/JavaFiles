abstract class Square{
    abstract int area(int side);
}
class Shape extends Square{
    int area(int side)
    {
        return side * side;
    }
    public static void main(String[] args) {
      Shape s = new Shape();
      int res = s.area(10);  
      System.out.println("Sqaure Area is: "+res);
    }
}