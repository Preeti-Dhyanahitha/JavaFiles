public class Digit_count
{
    public static void main(String[] args)
    {
      int n = 123456;
      int c = 0;
      while(n > 0)
      {
        c ++;
        n /= 10;
      }
      System.out.println("No.of digits in a given number:"+c);
    }
} 