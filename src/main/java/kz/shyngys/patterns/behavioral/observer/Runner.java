package kz.shyngys.patterns.behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        CarJobSite carJobSite = new CarJobSite();

        carJobSite.addVacancy("Engine worker");
        carJobSite.addVacancy("Wheel worker");

        Observer firstSubscriber = new Subscriber("First");
        Observer secondSubscriber = new Subscriber("Second");

        carJobSite.addObserver(firstSubscriber);
        carJobSite.addObserver(secondSubscriber);

        carJobSite.addVacancy("Manager");

        carJobSite.removeVacancy("Wheel worker");
    }
}
