import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Java","Python","Oracle","Spring","Cloud",
                "React","Angular","HTML","CSS","Bootstrap"));

        Consumer<ArrayList<String>> consumer = list -> {

            for(int i=0;i<list.size();i++){

                String rev = new StringBuilder(list.get(i))
                        .reverse()
                        .toString();

                list.set(i, rev);
            }
        };

        consumer.accept(words);

        System.out.println(words);
    }
}