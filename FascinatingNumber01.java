//The fascinating number program is frequently asked in Java coding tests.
/*What is a fascinating number?
Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

    If the given number is a 3 or more than three-digit
    If the value getting after concatenation contains all digits from 1 to 9, exactly once.
For example, 192, 1920, 2019, 327, etc. Let's understand the concept of fascinating numbers through an example.
 */
//This program checks whether a number is fascinating or not is that the number must have at least 3 or more than three digits.

//Implementation
import java.util.Scanner;

public class FascinatingNumber01 {
    public static void main(String[] args) {
        // get the number from user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //check if the number has at least 3-digits or not
        int temp, digits = 0;
        temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        if (digits < 3) {
            System.out.println("Not Fascinating."); //the number has less than 3-digits, print Not Fascinating.
        } else {
            int multiplyTwo = number * 2, multiplyThree = number * 3; //multiply the given number by 2 and 3, separately
            String concatNumber = number + "" + multiplyTwo + multiplyThree; //convert into a string

            boolean found = true;

            for (char ch = '1'; ch <= '9'; ch++) {
                int count = 0;
                for (int i = 0; i < concatNumber.length(); i++) { //loop counts the frequency of each digit
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

            if (found) {
                System.out.println("Fascinating.");
            } else
                System.out.println("Not Fascinating.");
        }
    }
}
