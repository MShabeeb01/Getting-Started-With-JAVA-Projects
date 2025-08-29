import java.util.*;

public class Basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income:");
        int income = sc.nextInt();
        int tax ;
        
        if (income < 300000) {
            tax = 0;
        }
        else if (income >= 300000 && income <=600000) {
            tax =(int) (0.05 * income);
        }
        else if (income > 600000 && income <=900000) {
            tax = (int) (0.1 * income);
        }
        else if (income > 900000 && income <= 1200000) {
            tax =(int) (0.15 * income);
        }
        else if (income > 1200000 && income <= 1500000) {
            tax = (int) (0.2 * income);
        }
        else{ tax =(int) (0.3 * income);}
        System.out.println("Tax to be Paid :" + tax );
    }
}
