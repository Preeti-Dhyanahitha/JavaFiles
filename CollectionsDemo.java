import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      // ArrayList 
      List<String> a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      //a1.add(100);
      a1.remove(3);
      //a1.add(2,200);
      //a1.addAll(a1);
      a1.addFirst("preeti");
      a1.addLast("vishwa");
      //a1.forEach(action);
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
   }
}
/*
      // LinkedList
      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      l1.add(10);
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
*/