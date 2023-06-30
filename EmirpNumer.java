/*A number is called an emirp number if we get another prime number on reversing the number itself. In other words, an emirp number is a number that is prime forwards or backward. It is also known as twisted prime numbers.*/
//This program checks if the given number is a Emirp number or not.
import java.util.Scanner;
public class EmirpNumer {
    //Build function to check if the number is a Prime or not - starts
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        } else {
            for(int i = 3; i <= x/2; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    } //Build function to check if the number is a Prime or not - ends

    //Build function to check if the number is a Emirp or not - starts
    public static boolean isEmirp(int number) {
        if (isPrime(number) == false) {
            return false;
        } else {
            int temp = number, lastdigit, reverse = 0;
            while (temp > 0) {
                lastdigit = temp % 10;
                reverse = reverse*10 + lastdigit;
                temp /= 10;
            }
            if (isPrime(reverse)) {
                return true;
            }
        }
        return false;
    }     //Build function to check if the number is a Emirp or not - ends

    //driver code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int input = sc.nextInt();

        if (isEmirp(input)) {
            System.out.println("The given number is a Emirp number.");
        } else System.out.println("The given number is not a Emirp number.");
    }
}
