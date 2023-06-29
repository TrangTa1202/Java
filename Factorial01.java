/*Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. */
//Use the loop to calculate factorial of a number entered by the user
import java.util.Scanner;
public class Factorial01 {
    public static void main(String[] args) {
        int fact = 1, i;
        
        //Get the number to calculate factorial from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for(i=1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
