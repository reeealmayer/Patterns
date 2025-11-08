package kz.shyngys.patterns.structural.adapter;

public class ToyotaFactory {
    public void buildToyota() {
        System.out.println("Building Toyota...");
    }

    public void modifyToyota() {
        System.out.println("Modifying Toyota");
    }

    public void destroyToyota() {
        System.out.println("Destroying Toyota");
    }
}
