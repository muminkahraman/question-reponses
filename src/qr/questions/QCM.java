package qr.questions;

import qr.themes.Theme;

public class QCM extends Question{
    private String reponse1;
    private String reponse2;
    private String bonneReponse;

    public QCM(String enonce,Difficulty difficulty, Theme theme,
               String reponse1, String reponse2, String bonneReponse ){
        super(enonce,difficulty, theme);
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.bonneReponse = bonneReponse;
    }


    @Override
    public String toString(){
        return "Question No: "+numero+" Type: QCM (Choisis une lettre parmi les options)\n" + "Difficulté: "+difficulty +
                "\nTheme: "+theme.getDesignation()+"\nenonce: "+enonce+"\n A. "+reponse1+"\n B. "
                +reponse2+"\n C."+bonneReponse+"\n---------\n";
    }

    @Override
    public Question saisie(String enonce, Difficulty difficulty, Theme theme) {
        return null;
    }

    public static QCM saisie(String enonce, Difficulty difficulty, Theme theme,
                      String reponse1, String reponse2, String bonneReponse) {

        return new QCM(enonce, difficulty, theme, reponse1,reponse2, bonneReponse);
    }

    /*public static Question saisie(String enonce, Difficulty difficulty, Theme theme,
                                   String reponse1, String reponse2, String bonneReponse) {
        return new QCM(enonce, difficulty, theme, reponse1,reponse2, bonneReponse);
    }*/
}
