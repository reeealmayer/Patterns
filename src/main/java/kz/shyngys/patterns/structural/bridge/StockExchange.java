package kz.shyngys.patterns.structural.bridge;

public class StockExchange extends Program {
    public StockExchange(ProgramDeveloper developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
