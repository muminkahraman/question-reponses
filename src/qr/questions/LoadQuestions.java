package qr.questions;

import qr.Qrgame;
import qr.questions.Difficulty;
import qr.questions.QCM;
import qr.questions.RC;
import qr.questions.VF;

/**
 * Ici les questions sont crees en dur
 */
public class LoadQuestions {
    /**
     * creation des questions de tous les types
     */
    public static void createQuestions(){
        //Création des types QCMs
        QCM qcm1 =  QCM.saisie(
                "Le nom du prof de TD java ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        QCM qcm2 =  QCM.saisie(
                "Le langage en circuit numérique?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(8),
                "VLC",
                "VHCL",
                "VHCL"
        );

        QCM qcm3 =  QCM.saisie(
                "Le nom du prof de TD java ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(7),
                "LASCHOOT",
                "LESCHOOT",
                "LANDSCHOOT"
        );

        QCM qcm4 =  QCM.saisie(
                "Ma marque d'eau minérale",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "CRISTAL",
                "CRISTALI",
                "CRISTALINE"
        );

        QCM qcm5 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(6),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm51 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm52 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm6 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );
        QCM qcm61 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "ELITE",
                "WWW",
                "RED NOTICE"
        );

        QCM qcm7 =  QCM.saisie(
                "Dernier Film de THE ROCK",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "ELITE",
                "WWW",
                "JUMANJI"
        );

        QCM qcm8 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "ELITE",
                "YOYO",
                "LOL"
        );
        QCM qcm81 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm9 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm91 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm10 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm11 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(0),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm12 =  QCM.saisie(
                "Le best E-SPORT MOBA",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "ELITE",
                "YOYO",
                "LOL"
        );

        QCM qcm13 =  QCM.saisie(
                "Le joueur en avant sur FIFA 22",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(2),
                "Mbappe",
                "Rashford",
                "Choupo Moting"
        );
        QCM qcm14 =  QCM.saisie(
                "Le meilleur trio d'attaque de l'espagne",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "CR7",
                "BBC",
                "MSN"
        );

        QCM qcm15 =  QCM.saisie(
                "Le meilleur trio d'attaque de l'espagne",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(7),
                "CR7",
                "BBC",
                "MSN"
        );

        QCM qcm16 =  QCM.saisie(
                "Le nom du responsable dissertation orale?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "SAMOA",
                "ZOLA",
                "SOMA"
        );

        QCM qcm188 =  QCM.saisie(
                "Le nom du responsable dissertation orale?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "SAMOA",
                "ZOLA",
                "SOMA"
        );

        QCM qcm17 =  QCM.saisie(
                "Le nom du responsable dissertation orale?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "SAMOA",
                "ZOLA",
                "SOMA"
        );


        //Création des types RC
        RC rc1 =  RC.saisie(
                "Le capitaine du PSG ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "Marquinios"
        );

        RC rc2 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "XAVI"
        );

        RC rc3 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(1),
                "XAVI"
        );

        RC rc4 =  RC.saisie(
                "Le coach du fc barcelone ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "XAVI"
        );

        RC rc43 =  RC.saisie(
                "Le coach du fc barcelone ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "XAVI"
        );

        RC rc44 =  RC.saisie(
                "Le coach du fc barcelone ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "XAVI"
        );

        RC rc42 =  RC.saisie(
                "Le coach du fc barcelone ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "XAVI"
        );

        RC rc41 =  RC.saisie(
                "Le coach du fc barcelone ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "XAVI"
        );

        RC rc5 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "XAVI"
        );

        RC rc6 =  RC.saisie(
                "Le coach du fc barcelone ?",
                
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(4),
                "XAVI"
        );

        RC rc7 =  RC.saisie(
                "Le coach du fc barcelone ?",
                
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(5),
                "XAVI"
        );

        RC rc8 =  RC.saisie(
                "Le tableau est vert",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "OUI"
        );

        RC rc9 =  RC.saisie(
                "fc barcelone en europa league ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "OUI"
        );

        RC rc10 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(3),
                "XAVI"
        );

        RC rc11 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "EVANS"
        );

        RC rc112 =  RC.saisie(
                "Le coach du fc barcelone ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "EVANS"
        );

        RC rc12 =  RC.saisie(
                "L'anime avec le plus d'épisodes ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(6),
                "EVANS"
        );

        RC rc13 =  RC.saisie(
                "Cobra de manga a une main??",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(9),
                "OUI"
        );

        RC rc14 =  RC.saisie(
                "Oub c'est bouboul ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "OUI"
        );

        RC rc15 =  RC.saisie(
                "Le campus de Gorki est le plus équipé",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(9),
                "NON"
        );

        RC rc155 =  RC.saisie(
                "Le campus de Gorki est le plus équipé",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "NON"
        );

        RC rc16 =  RC.saisie(
                "Le campus de Gorki est le plus équipé",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "NON"
        );

        RC rc161 =  RC.saisie(
                "Le campus de Gorki est le plus équipé",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                "NON"
        );

        RC rc17 =  RC.saisie(
                "Le meilleur buteur bundesliga?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "XAVI"
        );



        //Création des types VF
        VF vf1 =  VF.saisie(
                "Messi a remporté 7 ballons d'or ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                true
        );

        VF vf2 =  VF.saisie(
                "Le projet marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                true
        );

        VF vf3 =  VF.saisie(
                "Le projet marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                true
        );
        VF vf4 =  VF.saisie(
                "Le projet marche",
                
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(8),
                true
        );

        VF vf5 =  VF.saisie(
                "Le projet marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                true
        );

        VF vf6 =  VF.saisie(
                "Le projet voltaire marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                false
        );

        VF vf7 =  VF.saisie(
                "Le projet voltaire marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                false
        );

        VF vf8 =  VF.saisie(
                "Le projet voltaire marche",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                false
        );

        VF vf9 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                false
        );

        VF vf91 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                false
        );

        VF vf10 =  VF.saisie(
                "Le projet marche ?",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(3),
                true
        );

        VF vf11 =  VF.saisie(
                "Le projet marche ?",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(0),
                true
        );

        VF vf12 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(1),
                false
        );
        VF vf13 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(2),
                false
        );
        VF vf14 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                false
        );
        VF vf15 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                false
        );

        VF vf151 =  VF.saisie(
                "Le Kebab est mieux que le Tacos ",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                false
        );

        VF vf16 =  VF.saisie(
                "La Théorie du signl est importante pour un software enginner",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                false
        );

        VF vf17 =  VF.saisie(
                "Peter parker est iron man",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                false
        );

        VF vf18 =  VF.saisie(
                "Le crous se trouve dans le bâtiment B?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(9),
                false
        );

        VF vf211 =  VF.saisie(
                "Le crous se trouve dans le bâtiment B?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                false
        );

        VF vf19 =  VF.saisie(
                "Zelda est plus populaire que DBZ Tenkaishi III",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                false
        );
        VF vf20 =  VF.saisie(
                "Zelda est plus populaire que DBZ Tenkaishi III",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(4),
                false
        );

        VF vf21 =  VF.saisie(
                "Zelda est plus populaire que DBZ Tenkaishi III",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(5),
                false
        );




    }
}
