//enter a number and check if it is prime number?
import java.util.Scanner;
public class Prime01 {
    public static void main(String[] args) {
        int i, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        //if numbers are 0 or 1, it is not a prime number.
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        else {
            //check if number can divide other numbers except itself or 1 --> not a prime
            for(i=2; i <= n/2; i++) { //just check a range from 2 to number/2
                if (i%2 ==0) {
                    System.out.println(n + " is not a prime number.");
                    flag=1;
                    break;
                }
            }

            if (flag == 0) {
                    System.out.println(n + " is a prime number.");
                }
        }
    }
}
