package kz.shyngys.patterns.structural.adapter;

public class AdapterToyotaToCarApi extends ToyotaFactory implements CarApi {
    @Override
    public void buildCar() {
        buildToyota();
    }

    @Override
    public void destroyCar() {
        destroyToyota();
    }

    @Override
    public void modifyCar() {
        modifyToyota();
    }
}
