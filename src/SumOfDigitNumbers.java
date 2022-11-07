import java.util.Scanner;

public class SumOfDigitNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int digitsValue;
        int result = 0;

        while (tempNumber != 0) {
            digitsValue = tempNumber % 10;
            result += digitsValue;
            tempNumber /= 10;

        }
        System.out.println("Sum of digits of the number " + number + ": " + result);
    }
}
