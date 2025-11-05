package kz.shyngys.patterns.creational.abstract_facotry.website;

import kz.shyngys.patterns.creational.abstract_facotry.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("writes code in java");
    }
}
