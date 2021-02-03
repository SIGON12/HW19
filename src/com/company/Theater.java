package com.company;

public class Theater extends Public_build {
    String name;
    public Theater(int kol_flor,String name) {
        super(kol_flor);
        this.name = name;
    }
    void showinfobuild(){
        System.out.println("Название: " + name + " кол-во этажей: " + kol_vo );

    }
}
