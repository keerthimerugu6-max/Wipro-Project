import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for array A:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 3 elements for array B:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = {a[1], b[1]};

        System.out.println("New array with middle elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
