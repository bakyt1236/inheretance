package main;

import person.Footbalplayer;
import person.Programmer;
import person.Singer;

public class Main {

    public static void main(String[] args) {
        Footbalplayer footbalplayer = new Footbalplayer();
        footbalplayer.setJob("Footbalplayers");
        footbalplayer.setName("Rashford");
        footbalplayer.setSurname("Marcus");
        footbalplayer.setAge(25);
        footbalplayer.setGender("Male");
        footbalplayer.setBoots("Nike");
        Programmer programmer = new Programmer();
        programmer.setJob("Programmer");
        programmer.setName("Bob");
        programmer.setSurname("Hob");
        programmer.setAge(26);
        programmer.setGender("Male");
        programmer.setLaptop("Lenovo");
        Singer singer = new Singer();
        singer.setJob("Singer");
        singer.setNational("Dima");
        singer.setSurname("ilan");
        singer.setAge(30);
        singer.setGender("Gender:Male");
        singer.setNational("Rassian");
        System.out.println(footbalplayer);
        System.out.println(programmer);
        System.out.println(singer);
    }
}

