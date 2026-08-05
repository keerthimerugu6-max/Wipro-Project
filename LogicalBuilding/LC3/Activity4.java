import java.util.*;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[30];
        int[] count = new int[101];

        for (int i = 0; i < 30; i++) {
            marks[i] = sc.nextInt();
            count[marks[i]]++;
        }

        for (int i = 0; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " = " + count[i]);
            }
        }

        sc.close();
    }
}