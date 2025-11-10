package kz.shyngys.patterns.behavioral.chain;

public class EmergencyReport extends Reporter {

    public EmergencyReport(int priority) {
        super(priority);
    }

    @Override
    public void writeReport(String message) {
        System.out.println("Emergency sending report " + message);
    }
}
