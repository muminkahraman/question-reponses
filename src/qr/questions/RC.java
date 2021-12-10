package qr.questions;

import qr.themes.Theme;

public class RC extends Question{
    private String bonneReponse;

    public RC(String enonce,Difficulty difficulty, Theme theme,
              String bonneReponse ){
        super(enonce,difficulty, theme);
        this.bonneReponse = bonneReponse;
    }

    public String getBonneReponse() {
        return bonneReponse;
    }

    @Override
    public String toString(){
        return "Question No: "+numero+" Type: Réponse Courte (Saisis un cours texte ou chiffre) :\n"+"Difficulté: "+difficulty + "\nTheme :"+theme.getDesignation()+"\nenonce: "+enonce+"\n--------- \n";
    }

    @Override
    public Question saisie(String enonce, Difficulty difficulty, Theme theme) {
        return null;
    }

    public static RC saisie(String enonce,Difficulty difficulty, Theme theme,
                                   String bonneReponse ) {
        return new RC(enonce, difficulty, theme, bonneReponse );
    }
}
