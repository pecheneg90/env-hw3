package com.company;

public class ServiceStation implements CheckTransport {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.printf("Колесо %d - ", i + 1);
            updateTyre();
        }
        if (transport.getClass() == Car.class) {
            checkEngine();
        } else if (transport.getClass() == Truck.class) {
            checkEngine();
            checkTrailer();
        }
        System.out.println();
    }
}