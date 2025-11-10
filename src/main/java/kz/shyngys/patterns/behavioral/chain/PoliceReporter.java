package kz.shyngys.patterns.behavioral.chain;

public class PoliceReporter extends Reporter {
    public PoliceReporter(int priority) {
        super(priority);
    }

    @Override
    public void writeReport(String message) {
        System.out.println("Police officer sending report " + message);
    }
}
