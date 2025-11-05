package kz.shyngys.patterns.creational.abstract_facotry.website;

import kz.shyngys.patterns.creational.abstract_facotry.Developer;
import kz.shyngys.patterns.creational.abstract_facotry.Manager;
import kz.shyngys.patterns.creational.abstract_facotry.ProjectFactory;
import kz.shyngys.patterns.creational.abstract_facotry.Tester;

public class WebsiteProjectFactory implements ProjectFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
