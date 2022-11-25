package main;

import person.Footbalplayer;
import person.Programmer;
import person.Singer;

public class Main {

    public static void main(String[] args) {

        System.out.println(footbalplayer());
        System.out.println(programmer());
        System.out.println(singer());
    }

    public static Footbalplayer footbalplayer() {
        Footbalplayer footbalplayer = new Footbalplayer();
        footbalplayer.setJob("Footbalplayers");
        footbalplayer.setName("Rashford");
        footbalplayer.setSurname("Marcus");
        footbalplayer.setAge(25);
        footbalplayer.setGender("Male");
        footbalplayer.setBoots("Nike");


        return footbalplayer;

    }

    public static Programmer programmer() {
        Programmer programmer = new Programmer();
        programmer.setJob("Programmer");
        programmer.setName("Bob");
        programmer.setSurname("Hob");
        programmer.setAge(26);
        programmer.setGender("Male");
        programmer.setLaptop("Lenovo");

        return programmer;
    }

    public static Singer singer() {
        Singer singer = new Singer();
        singer.setJob("Singer");
        singer.setNational("Dima");
        singer.setSurname("ilan");
        singer.setAge(30);
        singer.setGender("Male");
        singer.setNational("Rassian");

        return singer;
    }
}



