public class SBAccount extends Account {

    private String accountType;

    public SBAccount(double amount, String accountType) throws InvalidAmountException {
        super(amount);

        if (amount < 0) {
            throw new InvalidAmountException(
                    "Invalid Amount. Please enter a positive value.");
        }

        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() {

        if (accountType.equalsIgnoreCase("Normal")) {
            interestRate = 4.0;
        } else if (accountType.equalsIgnoreCase("NRI")) {
            interestRate = 6.0;
        } else {
            interestRate = 0.0;
        }

        return (amount * interestRate) / 100;
    }
}