import java.util.Scanner;

public class SumLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int sum = lastDigitA + lastDigitB;

        System.out.println("Sum of last digits: " + sum);
    }
}
