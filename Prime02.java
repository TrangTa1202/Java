//build a method to check if the number entered by users is a prime number.
import java.util.Scanner;
public class Prime02 {
    //build method to check prime starts
    static void checkPrime(int num) {
        int i, flag = 0;

        //0 & 1 are not prime numbers.
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number.");
        }
        else {
            for(i=2; i <= num/2; i++) {
                if (num % i ==0) {
                    System.out.println(num + " is not a prime number.");
                    flag = 1; //mark this number as not a prime
                    break;
                }
            }

            if (flag == 0) { //check the flag if it is equal to 0, print "prime number"
                System.out.println(num + " is a prime number.");
            }
        }
    }
    // build method to check prime ends
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        checkPrime(num);
    }

}
