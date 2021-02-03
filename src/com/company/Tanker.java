package com.company;

public class Tanker extends Cargo_Ship {
    int carry_weight;

    public Tanker(String name,int carry_weight) {
        super(name);
        this.carry_weight = carry_weight;
    }
    void showinfoShip2(){
        System.out.println("Нзвание: " + name + " Грузоперевозка: " + carry_weight);
    }
}
