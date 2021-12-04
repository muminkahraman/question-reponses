package qr.questions;

import qr.themes.Theme;
import qr.themes.Themes;

public abstract class Question {
    protected String enonce;
    protected int numero;
    protected int indicator; // 1 si sélectionnée , 0 sinon
    protected Difficulty difficulty;
    protected Theme theme;

    public Question(String enonce, int numero, Difficulty difficulty, String theme){
        this.enonce = enonce;
        this.numero = numero;
        this.indicator = 0;
        this.difficulty = difficulty;

        //On rajoute directement cette question dans la liste des questions
        // de son thème
        for(Theme t : Themes.getThemeList()){
            if(t.getDesignation()==theme){
                this.theme = t;
                t.getListThemeQuestions().add(this);
            }
        //On rajoute cette question dans la grande liste de Questions
            Questions.addQuestion(this);
        }
    }
    @Override
    public String toString(){
        return "Une Question";
    }

    public abstract Question saisieQuestion();

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
