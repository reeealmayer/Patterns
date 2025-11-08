package kz.shyngys.patterns.structural.adapter;

public class CarRunner {
    public static void main(String[] args) {
        CarApi carApi = new AdapterToyotaToCarApi();

        carApi.buildCar();
        carApi.modifyCar();
        carApi.destroyCar();
    }
}
