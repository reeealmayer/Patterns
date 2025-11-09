package kz.shyngys.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Worker worker = new WorkerLead(new WorkerLead(new SeniorEngineWorker(new EngineWorker())));

        System.out.println(worker.makeJob());
    }
}
