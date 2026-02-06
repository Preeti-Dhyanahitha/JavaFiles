class Hi extends Thread 
{
    public void run() {
        for(int i =1;i<=5;i++){
        System.out.println("Hi");
        try{Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
        }
    }
}
class Hello extends Thread 
{
    public void run() {
        for(int i =1;i<=5;i++){
        System.out.println("Hello");
        try{Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
        }
    }
}
public class MultipleThreads{
    public static void main(String[] args) {
        Hi t1 = new Hi();
        Hello t2 = new Hello();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}