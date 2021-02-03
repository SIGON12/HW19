package com.company;

public class Player implements Technics{
    String playing;

    public Player(String playing) {
        this.playing = playing;
    }

    @Override
    public void model() {
        System.out.println("huawei");
    }
}
