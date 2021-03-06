package com.madhatters.androidbasic.domain;

import java.io.Serializable;

public class AyahModel implements Serializable {
    private int number;
    private String text;
    private int numberInSurah;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberInSurah() {
        return numberInSurah;
    }

    public void setNumberInSurah(int numberInSurah) {
        this.numberInSurah = numberInSurah;
    }
}
