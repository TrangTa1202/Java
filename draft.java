import java.util.*;
import java.io.*;
public class draft {
    public static void main(String[] args ) {
        int extremeSum = 0, meanSum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //find the absolute value of the given number
        number = Math.abs(number);

        n = number;
        while (n!= 0) {
            if (n == number || n<10) {
                extremeSum += n%10;
            } else {
                meanSum += n%10;
                n /= 10;
            }
        }
        System.out.println("The sum of extreme digits: " + extremeSum);
        System.out.println("The sum of mean digits: " + meanSum);

        if (extremeSum == meanSum){
            System.out.println("Xylem");
        } else System.out.println("Phloem.");
    }
}
