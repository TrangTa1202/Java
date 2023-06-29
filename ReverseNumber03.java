////How to reverse a number in Java
//Use recursion to reverse
import java.util.Scanner;
public class ReverseNumber03 {
    //build function starts
    static int reverseNumber(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        int lastDigit, reverseNumber = 0;
        while (number > 0) {
            lastDigit = number % 10;
            reverseNumber = reverseNumber*10 + lastDigit;
            number /= 10;
        }

        if (isNegative) {
            reverseNumber *= -1;
        }
        return reverseNumber;

    } //build function ends

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(reverseNumber(number));
    }
}
