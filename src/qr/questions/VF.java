package qr.questions;

import qr.themes.Theme;

public class VF extends  Question{
    private boolean bonnReponse;
    public VF(String enonce, int numero, Difficulty difficulty, Theme theme,
               boolean bonneReponse ){
        super(enonce, numero, difficulty, theme);
        this.bonnReponse = bonneReponse;
    }
}
