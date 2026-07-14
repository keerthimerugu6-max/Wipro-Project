public class FDAccount extends Account {

    private int noOfDays;
    private int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder)
            throws InvalidAmountException, InvalidDaysException {

        super(amount);

        if (amount < 0)
            throw new InvalidAmountException(
                    "Invalid Amount. Please enter non-negative values.");

        if (noOfDays < 0)
            throw new InvalidDaysException(
                    "Invalid Number of days. Please enter non-negative values.");

        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    public double calculateInterest() {

        // Amount below 1 Crore
        if (amount < 10000000) {

            if (ageOfACHolder >= 60) {

                if (noOfDays >= 7 && noOfDays <= 14)
                    interestRate = 5.00;
                else if (noOfDays >= 15 && noOfDays <= 29)
                    interestRate = 5.25;
                else if (noOfDays >= 30 && noOfDays <= 45)
                    interestRate = 6.00;
                else if (noOfDays >= 46 && noOfDays <= 60)
                    interestRate = 7.50;
                else if (noOfDays >= 61 && noOfDays <= 184)
                    interestRate = 8.00;
                else if (noOfDays >= 185 && noOfDays <= 365)
                    interestRate = 8.50;

            } else {

                if (noOfDays >= 7 && noOfDays <= 14)
                    interestRate = 4.50;
                else if (noOfDays >= 15 && noOfDays <= 29)
                    interestRate = 4.75;
                else if (noOfDays >= 30 && noOfDays <= 45)
                    interestRate = 5.50;
                else if (noOfDays >= 46 && noOfDays <= 60)
                    interestRate = 7.00;
                else if (noOfDays >= 61 && noOfDays <= 184)
                    interestRate = 7.50;
                else if (noOfDays >= 185 && noOfDays <= 365)
                    interestRate = 8.00;
            }

        }

        // Amount 1 Crore and above
        else {

            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = 6.50;
            else if (noOfDays >= 15 && noOfDays <= 29)
                interestRate = 6.75;
            else if (noOfDays >= 30 && noOfDays <= 45)
                interestRate = 6.75;
            else if (noOfDays >= 46 && noOfDays <= 60)
                interestRate = 8.00;
            else if (noOfDays >= 61 && noOfDays <= 184)
                interestRate = 8.50;
            else if (noOfDays >= 185 && noOfDays <= 365)
                interestRate = 10.00;
        }

        return (amount * interestRate) / 100;
    }
}