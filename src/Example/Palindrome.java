package Example;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter a 5 digit integer");
        number = input.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.print("You did not enter a 5 digit interer... try again please");
        } else {
            int left, right;
            left = number / 100;
            right = number % 10;

            if (left == right) {
                System.out.print(number + " is a palindrome");

            } else {
                System.out.print(number + " is not a palindrome");
            }
        }
    }
}