
//This program finds all the fascinating numbers between the given range.
import java.util.Scanner;

public class FascinatingNumber {
    // Build function to check if a number is fascinating or not starts
    static boolean isFascinating(int number) {// this method must return a result of type boolean
        int temp, digits = 0;
        temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        if (digits < 3) {
            return false;
        } else {
            String conncatNumber = "" + number + number * 2 + number * 3; // convert number into string
            for(char c='1'; c <= '9'; c++) {
                int count = 0;
                for(int i = 0; i < conncatNumber.length(); i++) {
                    char ch = conncatNumber.charAt(i);
                    if (ch == c) {
                        count++;
                    }
                }

                if (count > 1 || count == 0) {
                    return false;
                } else return true;
            }
        }
    } //build function ends here

    public static void main (String[] args) {

    }
}
