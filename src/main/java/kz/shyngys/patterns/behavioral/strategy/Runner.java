package kz.shyngys.patterns.behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Activity activity = new Working();
        worker.setActivity(activity);
        worker.executeActivity();
        worker.setActivity(new Training());
        worker.executeActivity();
    }
}
