import test.Foundation;

public class TestAccess {

    public static void main(String[] args) {

        Foundation f = new Foundation();

        // System.out.println(f.var1); // Error - Private
        // System.out.println(f.var2); // Error - Default
        // System.out.println(f.var3); // Error - Protected

        System.out.println("var4 = " + f.var4);
    }
}