import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10; //This gives the last digit.
            rev = (rev * 10) + lastDigit; //This equation gives the reversed number.
            num = num / 10; //Will run until the number becomes zero
        }

        System.out.println("Reversed number: " + rev);
    }
}
