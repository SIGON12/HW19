package com.company;

public class Meneger extends Enginer{
    public Meneger(String qualification,String progect) {
        super(qualification);
        this.progect = progect;
    }

    String progect;
    void ShowinfoSotrudnik(){
        System.out.println("Квалификация: " + qualification + " Проект: " + progect);
    }

}
