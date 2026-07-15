import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30.75f);
        numbers.add(100L);

        for(Number n : numbers){
            System.out.println(n);
        }
    }
}