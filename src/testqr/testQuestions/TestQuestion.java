package testqr.testQuestions;

import qr.Qrgame;
import qr.questions.*;
import qr.themes.Themes;

public class TestQuestion {

    private static Themes themes = new Themes();
    private static Questions questions = new Questions();

    public static void main(String[] args){
        QCM q1 =   QCM.saisie(
                "Le nom du prof de TD java ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        RC rc1 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(2),
                "XAVI"
        );

        VF vf1 = VF.saisie(
                "Le projet marche",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(7),
                true
        );

        System.out.println(q1);
        System.out.println(rc1);
        System.out.println(vf1);



    }
}
