import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(-10, 15, -8, 20, -4, 7, -13, -16, 18, -2));

        List<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List:");
        System.out.println(list);

        System.out.println("Negative Even Numbers:");
        System.out.println(result);
    }
}