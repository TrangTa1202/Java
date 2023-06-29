/*Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc. */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int temp, r, sum = 0;
        //Get the number to check for palindrome (from user input)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        temp = num; //Hold the number in temporary variable
        while(num > 0) { //Try to reverse number 
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        
        //Compare the temporary number with reversed number
        if (temp == sum) { //If both numbers are same, print "palindrome number"
            System.out.println(temp + " is a palindrome");
        }
        else { //Else print "not palindrome number"
            System.out.println(temp + " is not a palindrome");
        }
    }
}
