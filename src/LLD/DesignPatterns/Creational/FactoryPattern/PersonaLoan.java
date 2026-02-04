package LLD.DesignPatterns.Creational.FactoryPattern;

public class PersonaLoan implements Loan{
    @Override
    public boolean checkEligibility() {
        return false;
    }
}
