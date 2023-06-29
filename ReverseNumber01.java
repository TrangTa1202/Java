//How to reverse a number in Java
//Use loop (while loop) to reverse
import java.util.Scanner;
public class ReverseNumber01 {
    public static void main(String[] args) {
        int remainder, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reverse of the given number is: " + reverse);
    }
}
//this program did not handle if the numer is negative