public class TestDigitCount {

    public static void main(String[] args) {

        DigitInterface d = DigitCount::digitCount;

        System.out.println("Digit Count = " + d.count(123456));
    }
}