public class BankTest {

    public static void main(String[] args) {

        // a)
        ICICIBank i = new ICICIBank();
        System.out.println("ICICI Savings Interest : " + i.getSavingsInterestRate() + "%");
        System.out.println("ICICI Fixed Deposit Interest : " + i.getFixedDepositInterestRate() + "%");

        System.out.println();

        // b)
        KotMBank k = new KotMBank();
        System.out.println("Kotak Savings Interest : " + k.getSavingsInterestRate() + "%");
        System.out.println("Kotak Fixed Deposit Interest : " + k.getFixedDepositInterestRate() + "%");

        System.out.println();

        // c)
        GeneralBank g1 = new KotMBank();
        System.out.println("GeneralBank -> Kotak Savings : " + g1.getSavingsInterestRate() + "%");
        System.out.println("GeneralBank -> Kotak Fixed : " + g1.getFixedDepositInterestRate() + "%");

        System.out.println();

        // d)
        GeneralBank g2 = new ICICIBank();
        System.out.println("GeneralBank -> ICICI Savings : " + g2.getSavingsInterestRate() + "%");
        System.out.println("GeneralBank -> ICICI Fixed : " + g2.getFixedDepositInterestRate() + "%");
    }
}