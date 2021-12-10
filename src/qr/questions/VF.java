package qr.questions;

import qr.themes.Theme;

public class VF extends  Question{
    private boolean bonnReponse;
    public VF(String enonce,Difficulty difficulty, Theme theme,
               boolean bonneReponse){
        super(enonce,difficulty, theme);
        this.bonnReponse = bonneReponse;
    }

    public boolean getBonneReponse(){
        return bonnReponse;
    }

    @Override
    public String toString(){
        return "Question No: "+numero+" Type: Vrai/Faux :\n"+
                "Difficulté: "+difficulty + "\nTheme: "
                +theme.getDesignation()+"\nenonce: "+enonce+"(Tape V / F)\n---------\n";
    }

    @Override
    public  Question saisie(String enonce, Difficulty difficulty, Theme theme) {
        return null;
    }
    public static VF saisie(String enonce, Difficulty difficulty, Theme theme,
                                   boolean bonneReponse) {
        return new VF(enonce,difficulty, theme, bonneReponse );
    }
}
