package kz.shyngys.patterns.behavioral.strategy;

public class Working implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Working...");
    }
}
