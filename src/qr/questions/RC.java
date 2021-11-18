package qr.questions;

import qr.themes.Theme;

public class RC extends Question{
    private String bonneReponse;

    public RC(String enonce, int numero, Difficulty difficulty, Theme theme,
              String bonneReponse ){
        super(enonce, numero, difficulty, theme);
        this.bonneReponse = bonneReponse;
    }
}
