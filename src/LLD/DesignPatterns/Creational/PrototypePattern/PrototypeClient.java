package LLD.DesignPatterns.Creational.PrototypePattern;

public class PrototypeClient {

    public static void main(String[] args) {

        // Create Prototypes
        Loan personalLoan = new PersonalLoan();
        Loan homeLoan = new HomeLoan();

        // Clone prototypes to create instances
        Loan newPersonalLoan = personalLoan.clone();
        Loan newHomeLoan = homeLoan.clone();

        System.out.println(personalLoan + " : " +newPersonalLoan);
        System.out.println(homeLoan + " : " +newHomeLoan);

    }

}
