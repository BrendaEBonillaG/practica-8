import java.util.ArrayList;
import java.util.HashSet;

public class Ejem2_3 {
    public static void main(String[] args) {
        HashSet<Object> mySet = new HashSet<>();

        mySet.add(30);
        mySet.add(4.6);
        mySet.add(Integer.valueOf(30));
        mySet.add("Hola");
        mySet.add(false);
        mySet.add(null);

        System.out.println(mySet.contains(10));
        System.out.println(mySet.remove(null));
        System.out.println(mySet.add("Test"));
        System.out.println(mySet.size());

        System.out.println("\n=== ELEMENTOS HASHSET ===");
        for (Object o : mySet){
            System.out.println(o);
        }
    }
}
