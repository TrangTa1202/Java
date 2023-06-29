/*Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. */
//Use the recursion to calculate factorial of a number entered by the user
import java.util.Scanner;
public class Factorial02 {
    //build a method that calculates factorial using recursion
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1); //factorial function calls itself
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
