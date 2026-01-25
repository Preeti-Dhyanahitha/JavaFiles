class A{
    void Method1(){
        System.out.println("This is class A method");
    }
}
class B extends A{
   void Method2(){
        System.out.println("This is class B method");
    } 
}
class C extends B{
   void Method3(){
        System.out.println("This is class C method");
    } 
    public static void main(String[] args) {
       C c = new C();
       c.Method1();

    }
}