import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " ASCII values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Corresponding characters:");
        for (int val : arr) {
            System.out.print((char) val + " ");
        }

        sc.close();
    }
}
