public class diffieHellmanMessages {

    public static void main(String[] args) {

        // Calculation of A (Anna's Message) //Algorithm 6.1.1
        int A = diffieHellmanSetUp.powMod(2, 604, 787);
        System.out.println("A = " + A);
        // Output: A = 40

        // Calculation of B (Blake's Message) //Algorithm 6.1.1
        int B = diffieHellmanSetUp.powMod(2, 485, 787);
        System.out.println("B = " + B);
        // Output: B = 514

    }

}
