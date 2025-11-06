package kz.shyngys.patterns.creational.singleton;

public class SingleBook {
    private static SingleBook instance;

    public static SingleBook getInstance() {
        if (instance == null) {
            instance = new SingleBook();
        }
        return instance;
    }

    private SingleBook() {
    }
}
