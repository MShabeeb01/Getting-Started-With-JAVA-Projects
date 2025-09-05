import java.util.*;

public class FactorialExample {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // Factorial of n
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt(); // Read user input
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        sc.close(); // Close the scanner
    }
}
