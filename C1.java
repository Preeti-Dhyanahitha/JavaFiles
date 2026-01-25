interface A{
    void display1();
}
interface B{
    void display2();
}
class C1 implements A,B{
    void display1()
    {
        System.out.println("This is interface A method");
    }
    void display2()
    {
        System.out.println("This is interface B method");
    }
    public static void main(String[] args) {
    C1 c = new C1();
    c.display1();
    c.display2();
}
}