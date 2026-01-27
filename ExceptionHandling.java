public class ExceptionHandling{
    public static void main(String[] args) {
        int x=10,y=0,z;
        int[] arr = {1,2,3};
        try{
        z = x/y;
        arr[10] = 20;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division with zero cannot be done: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is not range "+ e);
        }
        finally{
        System.out.println("This is a finally block");}
    }
}