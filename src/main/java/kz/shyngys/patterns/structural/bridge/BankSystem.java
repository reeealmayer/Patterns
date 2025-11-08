package kz.shyngys.patterns.structural.bridge;

public class BankSystem extends Program {
    public BankSystem(ProgramDeveloper developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
