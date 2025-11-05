package kz.shyngys.patterns.creational.abstract_facotry.banking;

import kz.shyngys.patterns.creational.abstract_facotry.Manager;

public class ProductManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Manages bank project");
    }
}
