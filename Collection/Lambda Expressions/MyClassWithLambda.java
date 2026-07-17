public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String text = "Java Lambda Expressions are easy to learn";

        System.out.println("String : " + text);
        System.out.println("Word Count : " + wc.count(text));
    }
}