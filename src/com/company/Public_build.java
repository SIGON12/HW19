package com.company;

public class Public_build  implements Build {
    int kol_vo;

    public Public_build(int kol_vo) {
        this.kol_vo = kol_vo;
    }

    @Override
    public void kol_flor() {
        System.out.println("Количество этажей: " + "2");
    }
}
