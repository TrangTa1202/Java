/*Krishnamurthy number is another special number in Java. A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number.*/
//Just like Prime and Armstrong numbers, Krishnamurthy number is also frequently asked by the interviewers but with it's another name, i.e., Strong number.
//This program checks if the given number is a Krishnamurthy number or not
import java.util.Scanner;
public class KrishnamurthyNumer {
    //Build function to calculate the factorial - starts
    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * factorial(x-1);
    } //Build factoial function ends here

    //Build function to check if the given number is a Krishnamurthy number or not - starts
    public static boolean isKrishnamurthy(int number) {
        //Declare the variable sum to store the sum of the factorial of each digit.
        int temp = number, lastdigit, sum = 0;
        while (temp > 0) {
            lastdigit = temp % 10;
            sum += factorial(lastdigit);
            temp /= 10;
        }
        return (sum == number);
    }
    //Build function to check Krishnamurthy number ends
    //Driver code
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        if (isKrishnamurthy(input)) {
            System.out.println("The given number is a Krishnamurthy number.");
        } else System.out.println("The given number is not a Krishnamurthy number.");
    }
}
