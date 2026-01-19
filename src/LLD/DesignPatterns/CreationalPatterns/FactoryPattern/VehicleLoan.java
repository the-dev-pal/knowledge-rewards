package LLD.DesignPatterns.CreationalPatterns.FactoryPattern;

// Vehicle Loan Product
public class VehicleLoan implements Loan{
    @Override
    public double calculateInterestAmount(Account account) {
        return 5678.12;
    }

    @Override
    public boolean loanEligibility(Account account) {
        return account.isActive();
    }
}
