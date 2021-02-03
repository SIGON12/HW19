package com.company;

public class Cargo_Ship implements  Ship_2{
    String name;

    public Cargo_Ship(String name) {

        this.name = name;
    }

    @Override
    public void model() {
        System.out.println("Атлас1");
    }
}
