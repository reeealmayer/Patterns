package kz.shyngys.patterns.behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        Reporter emergencyReporter = new EmergencyReport(Priority.OK);
        Reporter policeReporter = new PoliceReporter(Priority.SOMETHING_WENT_WRONG);
        Reporter fbiReporter = new FBIReporter(Priority.NOW);

        emergencyReporter.setNextReporter(policeReporter);
        policeReporter.setNextReporter(fbiReporter);

        emergencyReporter.sendReport("ok", Priority.NOW);
    }
}
