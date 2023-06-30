//This program checks if the number is a Keith number or not.
import java.util.*;
public class KeithNumber {
    //Build function starts
    static boolean isKeith(int number) {
        //This list stores all the digits of the given number
        ArrayList<Integer> term = new ArrayList<Integer>();

        int temp = number, digits = 0;
        //This loop is to find the number of digits and add the digits to term ArrayList
        while (temp > 0) {
            term.add(temp%10);
            temp /=10;
            digits++;
        }
        //Reverse the list
        Collections.reverse(term);
        int next_term = 0, i, j;
        while (next_term < number) {
            next_term = 0;
            j = term.size() - 1;
            for (i= 0; i < digits; i++) {
                next_term += term.get(j);
                j--;
            }
            term.add(next_term);
        }
        //This method must return a result of type boolean. There will be two conditions: if the next_term greater than the number, return False means that the number is not a Keith. Else, equal, the given number is Keith.
        return (next_term == number); 
    } //Build function ends here
    //Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if (isKeith(input)) {
            System.out.println(input + " is a Keith number.");
        } else System.out.println(input + " is not a Keith number.");
    }
}