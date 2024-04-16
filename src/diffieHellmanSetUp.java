import java.util.HashSet;
import java.util.Set;

public class diffieHellmanSetUp {
    /**
     * 
     * Check if the g is a generator of the prime field of p
     * 
     * @param g the potential generator
     * @param p the prime number
     * @return true if g is a generator of the multiplicatative group of prime field
     */
    public static boolean isGenerator(int g, int p) {

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= p - 1; i++) {
            set.add(powMod(g, i, p));
            System.out.println(powMod(g, i, p));
        }

        if (set.size() == p - 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Algorithm 6.1.1. Right-to-left algorithm.
     * We code a function to calculate the b^e
     * 
     * @param b    the base
     * @param exp  the exponent
     * @param pMod the modulus
     * @return b^e mod pMod
     */
    public static int powMod(int b, int exp, int pMod) {
        int r = 1;

        while (exp > 0) {

            if (exp % 2 == 1) {
                // System.out.println(exp / 2 + "\t" + (b * b) % pMod + "\t" + r + "x" + b + "="
                // + (r * b) % pMod);
                r = (r * b) % pMod;
            } else {
                // System.out.println((exp / 2) + "\t" + ((b * b) % pMod) + "\t" + r);
            }
            b = (b * b) % pMod;
            exp /= 2;

        }
        return r;
    }

    public static void main(String[] args) {
        int p = 787;
        int g = 2;

        /*
         * if g is not a generator we could manually increase by one until we get
         * g to be a generator.
         */

        boolean isGen = isGenerator(g, p);

        if (isGen)
            System.out.println(
                    "Generator for prime field p = " + p + " is: " + g);

        // Output: Generator for prime field p = 787 is: 2

    }
}
