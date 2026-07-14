import java.util.Scanner;
import java.util.StringJoiner;

class MergeStringJoiner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter cities:");

        for (int i = 0; i < n1; i++) {
            s1.add(sc.next());
        }

        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter cities:");

        for (int i = 0; i < n2; i++) {
            s2.add(sc.next());
        }

        // Preserve originals
        StringJoiner join1 = new StringJoiner("-");
        join1.merge(s1);
        join1.merge(s2);

        StringJoiner join2 = new StringJoiner("-");
        join2.merge(s2);
        join2.merge(s1);

        System.out.println("\ns1 merged to s2 : " + join1);
        System.out.println("s2 merged to s1 : " + join2);

        sc.close();
    }
}