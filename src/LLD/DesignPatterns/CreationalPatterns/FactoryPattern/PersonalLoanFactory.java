package LLD.DesignPatterns.CreationalPatterns.FactoryPattern;

// Personal Loan Factory
public class PersonalLoanFactory extends LoanFactory{
    @Override
    public Loan loanType() {
        return new PersonalLoan();
    }
}
