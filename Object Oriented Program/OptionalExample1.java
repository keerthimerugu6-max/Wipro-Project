import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String[] names = new String[5];  // all elements are null by default

        Optional<String> optionalName = Optional.ofNullable(names[0]);

        if (optionalName.isPresent()) {
            System.out.println(optionalName.get().length());
        } else {
            System.out.println("Name is null, avoiding NullPointerException!");
        }
    }
}
