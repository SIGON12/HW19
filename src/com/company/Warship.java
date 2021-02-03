package com.company;

public class Warship implements Ship_1 {
    private int kol_vo;

    public int getKol_vo() {
        return kol_vo;
    }

    public void setKol_vo(int kol_vo) {
        this.kol_vo = kol_vo;
    }

    public Warship(int kol_vo) {
        this.kol_vo = kol_vo;
    }

    @Override
    public void model() {
        System.out.println("Прем1");
    }
}
