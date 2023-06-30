/*A positive integer is called a spy number if the sum and product of its digits are equal. In other words, a number whose sum and product of all digits are equal is called a spy number.*/
import java.util.Scanner;
public class SpyNumber01 {
    static boolean isSpy(int number) {
        //Declare 2 variables sum and product to store sum and product of digits. Initialize sum with 0 and product with 1.
        int temp = number, sum = 0, product = 1, lastdigit;
        while (temp > 0) {
            //Find the last digit of the given number
            lastdigit = temp % 10;
            //Add the last digit to the variable sum
            sum += lastdigit;
            //Multiply the last digit to the variable product
            product *= lastdigit;
            //Remove the last digit
            temp /= 10;
        }
        //If the varible sum and product have the same value, return True - the given number is Spy. Else return False - the given number is not Spy.
        return (sum == product);
    }

    //driver code
    public static void main (String[] args) {
        //Initialize a number from user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        if (isSpy(input)) {
            System.out.println("The given number is a Spy number.");
        } else System.out.println("The given number is not a Spy number.");
    }
}
