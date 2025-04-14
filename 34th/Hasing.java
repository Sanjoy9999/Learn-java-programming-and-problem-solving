import java.util.HashSet;//it is a un order set in java 
import java.util.Iterator;

public class Hasing {
    public static void main(String[] args) {
        // Create
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1); // list.add();
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println("Size of set is:" + set.size());

        // Print all elements
        System.out.println(set);

        // //Search--contains
        // if(set.contains(1)){
        // System.out.println("Set contains one");
        // }
        // if(!set.contains(6)){
        // System.out.println("does not contains");
        // }

        // //Delete
        // set.remove(1);
        // if(!set.contains(1)){
        // System.out.println(" does not contains or We delete one");
        // }

        // Iterator
        Iterator it = set.iterator();
        // hashNext; next

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}