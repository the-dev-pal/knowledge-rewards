package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class BankLoanFactory {

    public static LoanFactory getLoanFactory(String bankName){
        return switch (bankName){
            case "SBI" -> new SBILoanFactory();
            case "HDFC" -> new HDFCLoanFactory();
            default -> throw new IllegalArgumentException("Invalid bank name.");
        };
    }

}
