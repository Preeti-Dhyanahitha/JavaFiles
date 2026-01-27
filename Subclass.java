public class Superclass{
    int x = 10;
}
public class Subclass extends Superclass{
    int x = 20;

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        System.out.println(obj.x);          // prints 20
        System.out.println(((Superclass)obj).x); // prints 10
        //System.out.println(super.x);
    }
}