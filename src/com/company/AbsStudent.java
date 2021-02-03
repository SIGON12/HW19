package com.company;

public class AbsStudent implements Enrollee {

    int kurs;

    public AbsStudent(int kurs) {
        this.kurs = kurs;
    }

    @Override
    public void Predmet() {
        System.out.println("Phylosophy");
    }
}