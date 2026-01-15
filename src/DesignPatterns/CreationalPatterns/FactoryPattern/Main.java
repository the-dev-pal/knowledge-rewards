package DesignPatterns.CreationalPatterns.FactoryPattern;

public class Main {

    static void main(String[] args) {
        Account account1 = new Account("Vishnu", "ABCD123", true);
        Account account2 = new Account("Vinay", "ABCD1234", false);

        LoanFactory loanFactory = new VehicleLoanFactory();
        Loan loan = loanFactory.loanType();

        boolean isEligible = loan.loanEligibility(account2);
        if (isEligible){
            double interestAmount = loan.calculateInterestAmount(account2);
            System.out.println("Total interest amount: "+ interestAmount);
        }else {
            System.out.println("Not Eligible");
        }
    }
}
