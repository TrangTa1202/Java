import java.util.*;

public class XylemPhloemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = number, lastdigit;
        while (temp > 0) {
            lastdigit = temp % 10;
            list.add(lastdigit);
            temp /= 10;
        }
        int extremeSum = 0, meanSum = 0;
        extremeSum = list.get(0) + list.get(list.size()-1);
        for(int i = 1; i < list.size()-1;i++) {
            meanSum += list.get(i);
        }
        System.out.println("The sum of extreme digits: " + extremeSum);
        System.out.println("The sum of mean digits: " + meanSum);

        if (extremeSum == meanSum) {
            System.out.println("Xylem");
        } else
            System.out.println("Phloem.");
    }
}
