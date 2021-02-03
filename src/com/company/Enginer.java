package com.company;

public class Enginer implements Sotrudnik {
    String qualification;

    public Enginer(String qualification) {
        this.qualification=qualification;
    }

    @Override
    public void Namecompany() {
        System.out.println("Интепрайс С");
    }
}
