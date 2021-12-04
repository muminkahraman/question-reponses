package qr.questions;

import qr.themes.Theme;

public class QCM extends Question{
    private String reponse1;
    private String reponse2;
    private String bonneReponse;

    public QCM(String enonce, int numero, Difficulty difficulty, Theme theme,
               String reponse1, String reponse2, String bonneReponse ){
        super(enonce, numero, difficulty, theme);
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.bonneReponse = bonneReponse;
    }


    @Override
    public String toString(){
        return "Question No "+numero+" Type QCM :\n"+" Difficulté"+difficulty + "\nTheme :"+theme+"\n--------- \n enonce "+enonce+"\nA. "+reponse1+"\n B. "+reponse2+"\n C."+bonneReponse+"\n";
    }

    @Override
    public Question saisieQuestion() {
        return null;
    }
    public static Question saisieQuestion(String enonce, int numero, Difficulty difficulty, Theme theme,
                                   String reponse1, String reponse2, String bonneReponse) {
        return new QCM(enonce, numero, difficulty, theme, reponse1,reponse2, bonneReponse);
    }
}
