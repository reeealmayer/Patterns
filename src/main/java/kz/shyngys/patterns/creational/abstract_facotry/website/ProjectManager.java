package kz.shyngys.patterns.creational.abstract_facotry.website;

import kz.shyngys.patterns.creational.abstract_facotry.Manager;

public class ProjectManager implements Manager {

    @Override
    public void manageProject() {
        System.out.println("Manages website");
    }
}
