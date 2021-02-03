package com.company;

public class Aircraft_carier extends Warship{
    String name;

    public Aircraft_carier(int kol_vo,String name) {
        super(kol_vo);
        this.name=name;
    }
    void showinfoShip1(){
        System.out.println("Название: " + name + " Количество: " + getKol_vo() );
    }
}
