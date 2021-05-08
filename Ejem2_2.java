import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejem2_2 {

    public static void main(String[] args) {
        HashMap<String, Object> miMapa = new HashMap<>();

        miMapa.put("Un integer", 30);
        miMapa.put("Un double", 4.6);
        miMapa.put("Otro integer", Integer.valueOf(20));
        miMapa.put("Un string", "Hola");
        miMapa.put("Un boolean", false);
        miMapa.put("Un objeto indefinido", null);

        System.out.println("\n=== ELEMENTOS HASHMAP ===");
        for (Map.Entry<String, Object> entry : miMapa.entrySet()) {
            String llave = entry.getKey();
            Object valor = entry.getValue();
            String output = String.format("Key=[%s], Value=[%s]", llave, valor);
            System.out.println(output);
        }
    }
}
