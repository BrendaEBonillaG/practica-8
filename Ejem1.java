class Usuario {
    private String primer_nombre;
    private String apellido;

    public Usuario(String primer_nombre, String apellido) {
        this.primer_nombre = primer_nombre;
        this.apellido = apellido;
    }
    /*
    public String toString() {
        return "" +
            "primer_nombre: " + primer_nombre + "" + "apellido: " + apellido;
     }
     */
}

public class Ejem1 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Dregan", "Ganon");
        Usuario usuario2 = new Usuario("Edric", "Jobs");

        System.out.println(usuario2.equals(usuario1));
        System.out.println(usuario2.equals(usuario2));
    }
}
