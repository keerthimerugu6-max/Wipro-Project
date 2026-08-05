import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        String string3 = string1 + string2;

        System.out.println(string3);
    }
}