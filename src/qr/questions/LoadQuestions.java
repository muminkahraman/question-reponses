package qr.questions;

import qr.phases.Qrgame;
import qr.questions.Difficulty;
import qr.questions.QCM;
import qr.questions.RC;
import qr.questions.VF;

public class LoadQuestions {
    public static void createQuestions(){
        //Création des types QCMs
        QCM qcm1 = (QCM) QCM.saisieQuestion(
                "Le nom du prof de TD java ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(9),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        QCM qcm2 = (QCM) QCM.saisieQuestion(
                "Le langage en circuit numérique?",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(8),
                "VLC",
                "VHCL",
                "VHCL"
        );

        QCM qcm3 = (QCM) QCM.saisieQuestion(
                "Le nom du prof de TD java ?",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(7),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        QCM qcm4 = (QCM) QCM.saisieQuestion(
                "Ma marque d'eau minérale",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(7),
                "CRISTAL",
                "CRISTALI",
                "CRISTALINE"
        );

        QCM qcm5 = (QCM) QCM.saisieQuestion(
                "Dernier Film de THE ROCK",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(6),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm6 = (QCM) QCM.saisieQuestion(
                "Dernier Film de THE ROCK",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(5),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm7 = (QCM) QCM.saisieQuestion(
                "Dernier Film de THE ROCK",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(4),
                "ELITE",
                "WWW",
                "JUMANJI"
        );

        QCM qcm8 = (QCM) QCM.saisieQuestion(
                "Le best E-SPORT MOBA",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(3),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm9 = (QCM) QCM.saisieQuestion(
                "Le best E-SPORT MOBA",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(2),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm10 = (QCM) QCM.saisieQuestion(
                "Le best E-SPORT MOBA",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(3),
                "ELITE",
                "YOYO",
                "LOL"
        );



        //Création des types RC
        RC rc1 = (RC) RC.saisieQuestion(
                "Le capitaine du PSG ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(0),
                "Marquinios"
        );

        RC rc2 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(0),
                "XAVI"
        );

        RC rc3 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(1),
                "XAVI"
        );

        RC rc4 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(2),
                "XAVI"
        );

        RC rc5 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(3),
                "XAVI"
        );

        RC rc6 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(4),
                "XAVI"
        );

        RC rc7 = (RC) RC.saisieQuestion(
                "Le coach du fc barcelone ?",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(5),
                "XAVI"
        );

        RC rc8 = (RC) RC.saisieQuestion(
                "Le tableau est vert",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(4),
                "OUI"
        );

        //Création des types VF
        VF vf1 = (VF) VF.saisieQuestion(
                "Messi a remporté 7 ballons d'or ?",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(0),
                true
        );

        VF vf2 = (VF) VF.saisieQuestion(
                "Le projet marche",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(6),
                true
        );

        VF vf3 = (VF) VF.saisieQuestion(
                "Le projet marche",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(7),
                true
        );
        VF vf4 = (VF) VF.saisieQuestion(
                "Le projet marche",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(8),
                true
        );

        VF vf5 = (VF) VF.saisieQuestion(
                "Le projet marche",
                0,
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemeList().get(8),
                true
        );

        VF vf6 = (VF) VF.saisieQuestion(
                "Le projet voltaire marche",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(8),
                false
        );

        VF vf7 = (VF) VF.saisieQuestion(
                "Le projet voltaire marche",
                0,
                Difficulty.EASY,
                Qrgame.getThemes().getThemeList().get(2),
                false
        );

        VF vf8 = (VF) VF.saisieQuestion(
                "Le projet voltaire marche",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(3),
                false
        );

        VF vf9 = (VF) VF.saisieQuestion(
                "Le Kebab est mieux que le Tacos ",
                0,
                Difficulty.HARD,
                Qrgame.getThemes().getThemeList().get(8),
                false
        );

    }
}
