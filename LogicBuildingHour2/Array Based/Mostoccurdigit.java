import java.util.Scanner;

public class Mostoccurdigit {

    public int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] freq = new int[10];

        for (int i = 0; i < input2; i++) {
            int num = Math.abs(input1[i]);

            if (num == 0) {
                freq[0]++;
            }

            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int maxFreq = 0;
        int resultDigit = 0;

        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] >= maxFreq) {
                maxFreq = freq[digit];
                resultDigit = digit;
            }
        }

        return resultDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Mostoccurdigit obj = new Mostoccurdigit();
        int result = obj.mostFrequentlyOccurringDigit(arr, n);

        System.out.println("Most Frequently Occurring Digit = " + result);

        sc.close();
    }
}