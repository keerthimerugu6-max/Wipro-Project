import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result += 'z';
                found = true;
            } else {
                result += ch;
            }
        }

        if (found) {
            System.out.println(result);
        } else {
            System.out.println(str);
            System.out.println("No vowels present");
        }
    }
}