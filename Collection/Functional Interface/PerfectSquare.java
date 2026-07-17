import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PerfectSquare {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1,2,4,5,9,12,16,20,25,30));

        Predicate<Integer> p = n -> {
            int root = (int)Math.sqrt(n);
            return root * root == n;
        };

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}