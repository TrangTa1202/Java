
/*Strontio numbers are those four digits numbers when multiplied by 2 give the same digit at the hundreds and tens place. Remember that the input number must be a four-digit number.*/
//This program checks if the given number is a Strontio number or not
import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number must have four-digits. \nEnter a number: ");
        int number = sc.nextInt();

        number = ((number*2)%1000)/10;
        if (number/10 == number%10) {
            System.out.println("The given number is a Strontio number.");
        } else System.out.println("The given number is not a Strontio number.");
    }
}