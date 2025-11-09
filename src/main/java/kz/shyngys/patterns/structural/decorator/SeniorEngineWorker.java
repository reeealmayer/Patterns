package kz.shyngys.patterns.structural.decorator;

public class SeniorEngineWorker extends WorkerDecorator {
    public SeniorEngineWorker(Worker worker) {
        super(worker);
    }

    public String buildWheels() {
        return " Build wheels";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + buildWheels();
    }
}
