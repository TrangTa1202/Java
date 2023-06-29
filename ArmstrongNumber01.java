//The Armstrong number program frequently asked in Java coding interviews and academics.
//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//This program prints all the Armstrong numbers up to the specified limit
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber01 {
    //build function starts here
    public static boolean isArmstrong(int number) { //this method must return a result of type boolean
        int temp, sum = 0, digits = 0, last = 0;

        temp = number; //assign number into a temp variable
        while (temp > 0) { //use the loop to find digit times
            temp /= 10;
            digits++;
        }

        temp = number;
        while (temp > 0) {
            last = temp % 10; //determine the last digit from number
            sum += Math.pow(last, digits); // calculate the power of each last digit up to digit times and add them to sum variable
            temp /= 10; //remove the last digit by dividing temp to 10
        }

        if (number == sum) {
            return true;
        }
        else return false;
    } // build function ends here

    //driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a special limit for print all Armstrong numbers: ");
        int input = sc.nextInt();

        System.out.print("Armstrong number up to " + input + " are: ");

        for(int i = 0; i <= input; i++) {
            if (isArmstrong(i)) { //method calling
                System.out.print(i + ", ");
            }
        }
    }
}