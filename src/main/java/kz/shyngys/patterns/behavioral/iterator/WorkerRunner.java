package kz.shyngys.patterns.behavioral.iterator;


public class WorkerRunner {
    public static void main(String[] args) {
        String[] skills = {"engine", "wheels", "windows"};
        String name = "carWorker";

        Worker worker = new Worker(name, skills);
        Iterator iterator = worker.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
