//This program prints all the Spy number from a given range
import java.util.Scanner;
public class SpyNumber02 {
    //Build function to check if the number is Spy or not - starts
    static boolean isSpy(int number) {
        int temp = number, sum = 0, product = 1, lastdigit;
        
        while (temp > 0) {
            lastdigit = temp % 10;
            sum += lastdigit;
            product *= lastdigit;
            temp /=10;
        }
        return (sum == product);
    }
    //Build function ends here

    //driver code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lowerRange = sc.nextInt();

        System.out.print("Enter the upper range: ");
        int upperRange = sc.nextInt();

        System.out.print("The Spy number from " + lowerRange + " to " + upperRange + " are: " );
        for (int i = lowerRange; i <= upperRange; i++) {
            if (isSpy(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
