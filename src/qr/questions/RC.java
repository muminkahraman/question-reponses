package qr.questions;

import qr.themes.Theme;

public class RC extends Question{
    private String bonneReponse;

    public RC(String enonce, int numero, Difficulty difficulty, Theme theme,
              String bonneReponse ){
        super(enonce, numero, difficulty, theme);
        this.bonneReponse = bonneReponse;
    }


    @Override
    public String toString(){
        return "Question No "+numero+" Type Réponse Courte :\n"+" Difficulté"+difficulty + "\nTheme :"+theme+"\n--------- \n enonce "+enonce;
    }

    @Override
    public Question saisieQuestion() {
        return null;
    }
    public static Question saisieQuestion(String enonce, int numero, Difficulty difficulty, Theme theme,
                                   String bonneReponse ) {
        return new RC(enonce, numero, difficulty, theme, bonneReponse );
    }
}