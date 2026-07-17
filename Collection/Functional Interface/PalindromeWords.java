import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam","java","level","apple","radar",
                "hello","malayalam","racecar","book","noon"));

        Predicate<String> p = word ->
                word.equalsIgnoreCase(
                        new StringBuilder(word).reverse().toString());

        words.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}