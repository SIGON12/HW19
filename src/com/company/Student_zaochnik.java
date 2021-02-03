package com.company;

public class Student_zaochnik extends AbsStudent{

    private String name;

    public Student_zaochnik(int kurs, String name) {
        super(kurs);
        this.name = name;
    }

        void showinfoenrolle(){
        System.out.println("Cтудент: " + name + " курс: " + kurs);

    }
}
