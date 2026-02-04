package LLD.DesignPatterns.Creational.PrototypePattern;

public interface Loan extends Cloneable{

    public boolean checkEligibility();

    Loan clone();

}
