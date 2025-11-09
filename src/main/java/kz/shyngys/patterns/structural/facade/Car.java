package kz.shyngys.patterns.structural.facade;

public class Car {
    private boolean isNeededToRepair;

    public void setNeededToRepair(boolean neededToRepair) {
        isNeededToRepair = neededToRepair;
    }

    public boolean isNeededToRepair() {
        return isNeededToRepair;
    }
}
