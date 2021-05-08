import java.util.Locale;

public class Ejem1_4 {
    public static void main(String[] args) {

        String greetingA = "Hola mundo";
        String greetingB = "Hola mundo";

        System.out.println(greetingA.charAt(7));
        System.out.println(greetingA.compareTo(greetingB));
        System.out.println(greetingA.contains("Hola"));
        System.out.println(greetingA.equals('1'));
        System.out.println(greetingA.indexOf('1'));
        System.out.println(greetingA.length());
        System.out.println(greetingA.replace('1', 'x'));
        System.out.println(greetingA.toLowerCase());
        System.out.println(greetingA.toUpperCase());

    }
}
