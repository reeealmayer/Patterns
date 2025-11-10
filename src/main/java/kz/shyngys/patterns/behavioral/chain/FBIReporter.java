package kz.shyngys.patterns.behavioral.chain;

public class FBIReporter extends Reporter {

    public FBIReporter(int priority) {
        super(priority);
    }

    @Override
    public void writeReport(String message) {
        System.out.println("FBI sending report " + message);
    }
}
