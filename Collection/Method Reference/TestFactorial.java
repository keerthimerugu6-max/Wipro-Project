public class TestFactorial {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        MyFunction mf = obj::factorial;

        int result = mf.calculate(5);

        System.out.println("Factorial = " + result);
    }
}