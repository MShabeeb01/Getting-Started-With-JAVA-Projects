import java.util.*;

public class FactorialExample {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Method to calculate binomial coefficient (nCr)
    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt for n
        System.out.print("Enter value for n: ");
        int n = sc.nextInt();

        // Prompt for r
        System.out.print("Enter value for r: ");
        int r = sc.nextInt();

        // Optional: Validate input
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input. Ensure that 0 ≤ r ≤ n.");
        } else {
            int result = bincoeff(n, r);
            System.out.println("Binomial Coefficient of " + n + " and " + r + " is: " + result);
        }

        sc.close();
    }
}
