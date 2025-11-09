package kz.shyngys.patterns.structural.decorator;

public class WorkerLead extends WorkerDecorator {
    public WorkerLead(Worker worker) {
        super(worker);
    }

    public String sendWeekReport() {
        return " Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
