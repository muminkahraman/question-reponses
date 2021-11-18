package qr.questions;

import qr.themes.Theme;

public abstract class Question {
    protected String enonce;
    protected int numero;
    protected int indicator;
    protected Difficulty difficulty;
    protected Theme theme;

    public Question(String enonce, int numero, Difficulty difficulty, Theme theme){
        this.enonce = enonce;
        this.numero = numero;
        this.indicator = 0;
        this.difficulty = difficulty;
        this.theme = theme;
    }
    @Override
    public String toString(){
        return "Une Question";
    }

    public int getNumero() {
        return numero;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getIndicator() {
        return indicator;
    }

    public String getEnonce() {
        return enonce;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
