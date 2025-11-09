package kz.shyngys.patterns.structural.decorator;

public class EngineWorker implements Worker {
    @Override
    public String makeJob() {
        return "Build engine";
    }
}
