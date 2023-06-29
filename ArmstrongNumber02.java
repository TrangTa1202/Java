//The Armstrong number program frequently asked in Java coding interviews and academics.
//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//This program checks if the given number is an Armstrong number or not.
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber02 {
    //building function starts
    static boolean isArmstrong(int number) { //this method must return a type of boolean
        int temp, last = 0, digits = 0, sum = 0;

        temp = number;
        while (temp > 0) {//
            temp /= 10;
            digits ++;
        }

        temp = number;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        if (number == sum) {
            return true;
        } else return false;
    } //building function ends

    //driver code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //method calling
        if (isArmstrong(number)) {
            System.out.println("Armstrong.");
        }
        else System.out.println("Not Armstrong.");
    }
}
