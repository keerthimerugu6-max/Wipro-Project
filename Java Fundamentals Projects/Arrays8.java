import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                skip = true; // start ignoring
            } else if (skip && arr[i] == 7) {
                skip = false; // stop ignoring
            } else if (!skip) {
                sum += arr[i];
            }
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
