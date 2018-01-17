package com.example.student.kolokwium;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarze {


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private String imie;

    private  String nazwisko;

    Lekarze(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

}
