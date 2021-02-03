package com.company;

public class Video_player extends Player{
    String working;

    public Video_player(String playing,String working) {
        super(playing);
        this.working = working;
    }
    void showinfoTech(){
        System.out.println("Воспроизводит: " + playing + "," + working);
    }
}
