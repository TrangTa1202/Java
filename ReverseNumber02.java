//How to reverse a number in Java
//Use recursiom
import java.util.Scanner;
public class ReverseNumber02 {
    //build function - using recursion starts
    static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    } //build function - using recursion ends

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); //get a number from the input
        int number = sc.nextInt();
        reverseNumber(number); //method calling
    }
}
//this program did not handle numbers if it is negative. the revere of 10 is 01.
