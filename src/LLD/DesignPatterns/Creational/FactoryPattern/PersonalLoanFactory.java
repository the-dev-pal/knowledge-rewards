package LLD.DesignPatterns.Creational.FactoryPattern;

// Personal Loan Factory
public class PersonalLoanFactory extends LoanFactory{
    @Override
    public Loan loanType() {
        return new PersonalLoan();
    }
}
