import java.util.Scanner;
import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array after removing duplicates:");
        int prev = arr[0];
        System.out.print(prev + " ");
        for (int i = 1; i < n; i++) {
            if (arr[i] != prev) {
                System.out.print(arr[i] + " ");
                prev = arr[i];
            }
        }

        sc.close();
    }
}
