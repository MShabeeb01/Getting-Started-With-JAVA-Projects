import java.util.*;  //This module is imported to use the Scanner class for reading user input.

public class Odd_Or_Even {     // In JAVA every program must be inside a class. This is a container for your code.

    public static void main(String args[]) {    //This is entry point of any JAVA application.
        Scanner sc = new Scanner(System.in);     //This creates Scanner object names sc to read input from the console.
        System.out.println("Enter the number to Check:");   //This is the basic function used to print the output.
        int number = sc.nextInt();   //Takes the User input.
        if (number % 2 == 0) {
        System.out.println("The number is Even");
        } else {
            System.out.println("The number is ODD");
        }
        
    }
}
