import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        //System.out.println(al);
        al.add(1, 99);
        //System.out.println(al);
        al.remove(2);
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());
        }

        /*
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.size());
        al.add("java");
        System.out.println(al);
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        //pq.add(50);
        //pq.add(5);
        System.out.println(pq);
        //System.out.println(pq.poll());
    */
    }
}
