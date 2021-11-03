public class EratosthenesSieve {
    public void sieveOfEratosthenes(int n) {
        boolean primeNum[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            primeNum[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            if (primeNum[p] == true) {
                // Update multipliers of p
                for (int i = p * p; i <= n; i += p)
                    primeNum[i] = false;
            }
        }

        // Display all numbers
        for (int i = 2; i <= n; i++) {
            if (primeNum[i] == true)
                System.out.print(i + " ");
        }
    }
}
