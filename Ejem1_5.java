public class Ejem1_5 {
    public static void main(String[] args) {

        String nombre = "Dregan";
        float PI = 3.141592F;
        int porcentaje = 50;

        String formatString = "\t Hola %s! \n EL valor de PI es %f \n de la población son mujeres.";

        String resultado = String.format(formatString, nombre, PI, porcentaje);
        System.out.println(resultado);
    }

}
