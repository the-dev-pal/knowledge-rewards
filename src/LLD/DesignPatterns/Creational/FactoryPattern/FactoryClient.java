package LLD.DesignPatterns.Creational.FactoryPattern;

public class FactoryClient {

    public static void main(String[] args) {

        LoanFactory personalLoanFactory = new PersonalLoanFactory();
        Loan personalLoan = personalLoanFactory.getLoan();

        boolean personalLoanEligibility = personalLoan.checkEligibility();

        LoanFactory homeLoanFactory = new HomeLoanFactory();
        Loan homeLoan = homeLoanFactory.getLoan();

        boolean homeLoanEligibility = homeLoan.checkEligibility();

    }

}
