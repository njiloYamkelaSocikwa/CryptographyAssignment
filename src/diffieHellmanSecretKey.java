/**
 * diffieHellmanSecretKey
 */
public class diffieHellmanSecretKey {

    public static void main(String[] args) {

        // Let S be an integer mod 787.
        int S;

        // Parameters
        int A = 40;
        int b = 485;

        S = diffieHellmanSetUp.powMod(A, b, 787);
        System.out.println("S = " + S);
        // Output: S = 112;

        // Parameters
        int B = 514;
        int a = 604;

        S = diffieHellmanSetUp.powMod(B, a, 787);
        System.out.println("S = " + S);
        // Output: S = 112;

        // Parameters
        int g = 2;
        a = 604;
        b = 485;

        S = diffieHellmanSetUp.powMod(g, a * b, 787);
        System.out.println("S = " + S);
        // Output: S = 112;

    }
}