import java.util.ArrayList;

public class PrimeNumbersLambda {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        // Adding 25 random numbers
        for (int i = 0; i < 25; i++) {
            a1.add((int)(Math.random() * 100) + 1);
        }

        System.out.println("Numbers:");
        System.out.println(a1);

        System.out.println("\nPrime Numbers:");

        a1.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}