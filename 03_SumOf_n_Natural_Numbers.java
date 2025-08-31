import java.util.*;
public class Basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i<=n) {
            sum +=i ;
            i++;
        }
        System.out.println("The sum of first " + n + " natural number is: " + sum);
    }
}   
