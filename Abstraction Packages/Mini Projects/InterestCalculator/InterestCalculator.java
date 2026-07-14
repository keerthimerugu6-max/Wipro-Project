import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nMAIN MENU");
            System.out.println("---------");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option (1..4): ");
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter the Average amount in your account: ");
                        double sbAmount = sc.nextDouble();

                        System.out.print("Enter Account Type (Normal/NRI): ");
                        sc.nextLine();
                        String type = sc.nextLine();

                        SBAccount sb = new SBAccount(sbAmount, type);

                        System.out.println("Interest gained: Rs. " + sb.calculateInterest());

                        break;

                    case 2:

                        System.out.print("Enter the FD amount: ");
                        double fdAmount = sc.nextDouble();

                        System.out.print("Enter the number of days: ");
                        int days = sc.nextInt();

                        System.out.print("Enter your age: ");
                        int age = sc.nextInt();

                        FDAccount fd = new FDAccount(fdAmount, days, age);

                        System.out.println("Interest gained is: Rs. " + fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter Monthly RD Amount: ");
                        double monthlyAmount = sc.nextDouble();

                        System.out.print("Enter Number of Months (6/9/12/15/18/21): ");
                        int months = sc.nextInt();

                        System.out.print("Enter your age: ");
                        int rdAge = sc.nextInt();

                        RDAccount rd = new RDAccount(monthlyAmount, months, rdAge);

                        System.out.println("Interest gained is: Rs. " + rd.calculateInterest());

                        break;

                    case 4:

                        System.out.println("Thank You!!");
                        break;

                    default:

                        System.out.println("Invalid Choice.");

                }

            }

            catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }

            catch (InvalidDaysException e) {
                System.out.println(e.getMessage());
            }

            catch (InvalidMonthsException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}