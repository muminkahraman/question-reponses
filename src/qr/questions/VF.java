package qr.questions;

import qr.themes.Theme;

public class VF extends  Question{
    private boolean bonnReponse;
    public VF(String enonce, int numero, Difficulty difficulty, Theme theme,
               boolean bonneReponse){
        super(enonce, numero, difficulty, theme);
        this.bonnReponse = bonneReponse;
    }

    public boolean getBonneReponse(){
        return bonnReponse;
    }

    @Override
    public String toString(){
        return "Question No: "+numero+" Type: Vrai/Faux :\n"+"Difficulté: "+difficulty + "\nTheme: "+theme.getDesignation()+"\nenonce: "+enonce+"(V / F)\n---------\n\n";
    }

    @Override
    public Question saisieQuestion() {
        return null;
    }
    public static Question saisieQuestion(String enonce, int numero, Difficulty difficulty, Theme theme,
                                   boolean bonneReponse) {
        return new VF(enonce, numero, difficulty, theme, bonneReponse );
    }
}
