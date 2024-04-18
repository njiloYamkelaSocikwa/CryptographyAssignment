public class diffieHellmanManInTheMiddle extends diffieHellmanSetUp {
    public static void main(String[] args) {

        // Public keys
        int g = 2;
        int n = 787;

        int A = 40;
        int B = 514;
        int a = 604; // Anna's private key (previous example)
        int b = 485; // Blakes's private key (previous example)
        int x = 579; // Max's private key randomly generated
        int y = 550; // Max's private key randomly generated
        int X = powMod(g, x, n); // g^x mod n
        int Y = powMod(g, y, n); // g

        System.out.print("S_A = ");
        System.out.print(powMod(A, y, n) + " = "); // A^y mod n
        System.out.print(powMod(Y, a, n) + " = "); // Y^a mod n
        System.out.print(powMod(g, y * a, 787)); // g^ya mod n

        System.out.println();

        System.out.print("S_B = ");
        System.out.print(powMod(B, x, n) + " = "); // B^x mod n
        System.out.print(powMod(X, b, n) + " = "); // X^b mod n
        System.out.print(powMod(g, x * b, 787)); // g^xb mod n

        /*
         * S_A = 529 = 529 = 529
         * S_B = 627 = 627 = 627
         */

    }
}
