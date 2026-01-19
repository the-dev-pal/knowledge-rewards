package LLD.DesignPatterns.CreationalPatterns.FactoryPattern;

// Vehicle Loan Factory
public class VehicleLoanFactory extends LoanFactory{
    @Override
    public Loan loanType() {
        return new VehicleLoan();
    }
}
