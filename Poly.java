class Poly
{
    int add(int x,int y)    {
        return x+y;
    }
    int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println(p.add(10,20));
        System.out.println(p.add(10,20,30));
    }
}