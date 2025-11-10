package kz.shyngys.patterns.behavioral.chain;

public abstract class Reporter {
    private int priority;
    private Reporter nextReporter;

    public Reporter(int priority) {
        this.priority = priority;
    }

    public void setNextReporter(Reporter nextReporter) {
        this.nextReporter = nextReporter;
    }

    public void sendReport(String message, int level) {
        if (level >= priority) {
            writeReport(message);
        }
        if (nextReporter != null) {
            nextReporter.sendReport(message, level);
        }
    }

    public abstract void writeReport(String message);
}
