class A{
    int x=200;
    A(String name){
        System.out.println("A's Constructor"+name);
    }

}
class B extends A{
    B(String name){
        super(name);
        System.out.println("B's Constructor"+name);
    }
    int x=100;
   
    public static void main(String[] args) {
      //  B b = new B("Preeti");
    System.out.println(x);
    }
}