package com.example.notatkikeep3;

public class Notatka {

    private String tytul;
    private String tresc;

    public Notatka(String tytul, String tresc) {
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public String getTytul() {
        return tytul;
    }

    public String getTresc() {
        return tresc;
    }

    @Override
    public String toString() {
        return tytul + "\n" + tresc;
    }
}