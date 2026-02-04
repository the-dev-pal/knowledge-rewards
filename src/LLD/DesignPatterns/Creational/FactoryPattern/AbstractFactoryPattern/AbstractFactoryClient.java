package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        LoanFactory loanFactorySBI = BankLoanFactory.getLoanFactory("SBI");

        Loan loanSBI  = loanFactorySBI.getLoan();
        loanSBI.checkEligibility();

        LoanFactory loanFactoryHDFC = BankLoanFactory.getLoanFactory("HDFC");

        Loan loanHDFC  = loanFactoryHDFC.getLoan();
        loanHDFC.checkEligibility();
    }

}
