package kz.shyngys.patterns.behavioral.state;

public class Working implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Working...");
    }
}
