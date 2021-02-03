package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Студент ");
        Student_zaochnik student1 = new Student_zaochnik(1, "alex"); // студент
        AbsStudent st2 = new AbsStudent(1);
        Student_zaochnik student2 = new Student_zaochnik(2, "andrey");
        student1.showinfoenrolle();
        student2.showinfoenrolle();
        st2.Predmet();
        System.out.println("Руководитель ");
        Meneger meneger1 = new Meneger("первая", "тед"); // руководитель
        Enginer enginer1 = new Enginer("Высшая");
        Meneger meneger2 = new Meneger("третья", "zex");
        meneger1.ShowinfoSotrudnik();
        meneger2.ShowinfoSotrudnik();
        enginer1.Namecompany();
        System.out.println("Театр");
        Theater theater1 = new Theater(3,"детский"); // здание
        Theater theater = new Theater(2,"кукол");
        theater.showinfobuild();;
        theater1.showinfobuild();
        Public_build build =new Public_build(3);
        build.kol_flor();
        System.out.println("Авианосец");
        Aircraft_carier ac = new Aircraft_carier(2,"Эксор"); // авианосец
        Aircraft_carier ac1 = new Aircraft_carier(1,"Ямато");
        Warship ex = new Warship(2);
        ac.showinfoShip1();
        ac1.showinfoShip1();
        ex.model();
        System.out.println("Танкер");
        Tanker tanker = new Tanker("атлас", 20);  // танкер
        Tanker tenker1 = new Tanker("Василёк",15);
        Cargo_Ship C = new Cargo_Ship("Ivan");
        tanker.showinfoShip2();
        tenker1.showinfoShip2();
        C.model();
        System.out.println("Видеоплеер");
        Video_player vd = new Video_player("Джаз"," мелодрамма"); // техника
        Video_player vd2 = new Video_player("pholk","Triler");
        Player pl = new Player("Музыка");
        vd.showinfoTech();
        vd2.showinfoTech();
        pl.model();
        System.out.println("Транспорт");
        Tram tr = new Tram("el",2); // транспорт
        Tram tr1 = new Tram("el",3);
        Public_vehicle ptr = new Public_vehicle("Solyra");
        tr.showinfoVenichle();
        tr1.showinfoVenichle();
        ptr.model();
    }}
