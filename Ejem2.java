import java.io.FileOutputStream;
import java.util.ArrayList;

public class Ejem2 {
    public static void main(String[] args) {
        ArrayList<Object> miLista = new ArrayList<>();

        miLista.add(30);
        miLista.add(4.6);
        miLista.add(Integer.valueOf(20));
        miLista.add("Hola");
        miLista.add(false);
        miLista.add(null);

        System.out.println(miLista.contains(20));
        System.out.println(miLista.get(1));
        System.out.println(miLista.remove(false));
        System.out.println(miLista.set(4, "Test"));
        System.out.println(miLista.size());

        System.out.println("\n=== ELEMENTOS DE LA LISTA === ");
        for (Object o : miLista) {
            System.out.println(o);
        }

    }
}
