package kz.shyngys.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        workers.remove(worker);
    }

    public void createCar() {
        System.out.println("Team creates car...");
        for (Worker worker : workers) {
            worker.createCar();
        }
    }
}
