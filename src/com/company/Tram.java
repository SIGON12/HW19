package com.company;

public class Tram extends Public_vehicle {
    int marshryt;

    public Tram(String fuel,int marshryt) {
        super(fuel);
        this.marshryt = marshryt;
    }
    void showinfoVenichle(){
        System.out.println("Тип топлива: " + fuel + " Маршрут: " + marshryt);
    }
}
