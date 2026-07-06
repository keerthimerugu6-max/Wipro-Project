import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        // First add evens
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        // Then add odds
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        System.out.println("Array after rearranging (evens first):");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
