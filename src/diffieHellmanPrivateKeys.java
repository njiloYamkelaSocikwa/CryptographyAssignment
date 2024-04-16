import java.util.Random;

/**
 * Private Keys
 */
public class diffieHellmanPrivateKeys {

    static long seed = (long) 0.26403919;
    static Random a = new Random(seed);

    public static void generateNumber(String name, int p) {
        int privatekey = a.nextInt(p);
        System.out.println(name + "'s private key is: " + privatekey);
    }

    public static void main(String[] args) {

        generateNumber("Anna", 787);
        generateNumber("Blake", 787);
        // Output:
        /*
         * Anna's private key is: 604
         * Blake's private key is: 485
         */

    }
}