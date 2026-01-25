class Poly1{
void display()
{
    System.out.println("Poly1 display method");
}
}
class Poly2 extends Poly1{
void display()
{
    System.out.println("Poly2 display method");
}
public static void main(String[] args) {
    Poly2 p = new Poly2();
    p.display();
}
}