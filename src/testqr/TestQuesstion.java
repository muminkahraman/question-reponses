package testqr;

import qr.phases.Qrgame;
import qr.questions.*;
import qr.themes.Themes;

public class TestQuesstion {

    private static Themes themes = new Themes();
    private static Questions questions = new Questions();

    public static void main(String[] args){
        QCM q1 =  (QCM) QCM.saisieQuestion(
                "Le nom du prof de TD java ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(9),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        RC rc1 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(2),
                "XAVI"
        );

        VF vf1 = (VF) VF.saisieQuestion(
                "Le projet marche",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(7),
                true
        );

        System.out.println(q1);
        System.out.println(rc1);
        System.out.println(vf1);



    }
}
