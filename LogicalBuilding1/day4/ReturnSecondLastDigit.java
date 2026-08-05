import java.util.Scanner;

public class ReturnSecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int secondLastDigit = (n / 10) % 10;   // remove last digit, then take remainder
        System.out.println("Second last digit: " + secondLastDigit);
    }
}
