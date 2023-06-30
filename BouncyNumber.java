
/*A positive integer that is neither in increasing nor decreasing number is called a bouncy number. It means they bounce between increasing and decreasing. In other words, we can say that if the digits of the number are unsorted. */
//This program checks if the given number is a Bouncy number or not
import java.util.*;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        char digit;
        boolean flagIncrease = true;
        String str = Integer.toString(number);
        // check if incresing or not
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit > str.charAt(i + 1)) {
                flagIncrease = false;
                break;
            }
            System.out.println(flagIncrease);
        }

        if (flagIncrease) {
            System.out.println("Increasing");
        } else
            System.out.println("Checking increasing fails");

        boolean flagDecrease = true;
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit < str.charAt(i + 1)) {
                flagDecrease = false;
                break;
            }
            System.out.println(flagDecrease);
        }

        if (flagDecrease) {
            System.out.println("Decreasing");
        } else
            System.out.println("Checking decreasing fails");

        if (flagIncrease == false & flagDecrease == false & number >= 101) {
            System.out.println("Bouncy.");
        } else
            System.out.println("Not Bouncy.");
    }
}
