package kz.shyngys.patterns.creational.abstract_facotry.banking;

import kz.shyngys.patterns.creational.abstract_facotry.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("writes code in php");
    }
}
