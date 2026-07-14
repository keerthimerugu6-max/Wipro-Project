import java.util.Scanner;

class RemoveFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        System.out.println(str.substring(1, str.length() - 1));

        sc.close();
    }
}