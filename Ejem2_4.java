import java.util.Random;

public class Ejem2_4 {

    public static void main(String[] args){
        Random randomNumbers = new Random();

        System.err.println(randomNumbers.nextInt());
        System.err.println(randomNumbers.nextDouble());
        System.err.println(randomNumbers.nextFloat());
        System.err.println(randomNumbers.nextLong());
    }
}
