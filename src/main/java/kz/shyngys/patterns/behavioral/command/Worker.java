package kz.shyngys.patterns.behavioral.command;

public class Worker {
    Command create;
    Command modify;
    Command destroy;

    public Worker(Command create, Command modify, Command destroy) {
        this.create = create;
        this.modify = modify;
        this.destroy = destroy;
    }

    public void createCar() {
        create.execute();
    }

    public void modifyCar() {
        modify.execute();
    }

    public void destroyCar() {
        destroy.execute();
    }
}
