//This program finds all the fascinating numbers between the given range.
import java.util.Scanner;

public class FascinatingNumber02 {
    // Build function to check if a number is fascinating or not - starts
    static boolean isFascinating(int number) {// This method must return a result of type boolean
        boolean found = true;
        // check if the number has at least 3-digits or not
        int temp, digits = 0;
        temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        if (digits < 3) {
            return found = false;
        } else {
            String concatNumber = "" + number + number * 2 + number * 3; //multiply the given number by 2 and 3, separately and convert it into a string
            ////loop counts the frequency of each digit
            for (char ch = '1'; ch <= '9'; ch++) {
                int count = 0;
                for (int i = 0; i < concatNumber.length(); i++) { 
                    char c = concatNumber.charAt(i);
                    if (c == ch) {
                        count++;
                    }
                }
                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }
        }
        return found;
    } // Build function ends

    // driver code
    public static void main (String[] args) {
        System.out.print("Enter the lower range: ");
        Scanner sc = new Scanner(System.in);
        int lowerRange = sc.nextInt();

        System.out.print("Enter the upper range: ");
        int upperRange = sc.nextInt();

        System.out.print("The fascinating number from " + lowerRange + " to " + upperRange + " are: ");

        for(int i = lowerRange; i <= upperRange; i++) {
            if (isFascinating(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
