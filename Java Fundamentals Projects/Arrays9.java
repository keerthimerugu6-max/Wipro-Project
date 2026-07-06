import java.util.Scanner;

public class Arrays9 {
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

        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Array after removing 10s:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
