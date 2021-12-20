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
                "Qu'est-ce qu'un aspic ?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(8),
                "Une darne de poisson",
                "Un plat à base d'anguilles",
                "Un mets présenté en gelée"
        );

        QCM qcm3 =  QCM.saisie(
                "C'est quoi Internet ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(7),
                "un réseau téléphonique permettant de relier les personnes",
                "un des 7 nains du dessin animé Blanche Neige",
                "un réseau mondial permettant de connecter tous les ordinateurs entre eux"
        );

        QCM qcm4 =  QCM.saisie(
                "C'est quoi le Web ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "un dispositif de sécurité",
                "un dessert californien",
                "un système permettant de consulter, avec un navigateur, des pages accessibles sur des sites"
        );

        QCM qcm5 =  QCM.saisie(
                "De quel pays le tourisme est-il originaire ?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(6),
                "Japon",
                "France",
                "Royaume-Uni"
        );

        QCM qcm51 =  QCM.saisie(
                "A quel siècle a-t-il commencé à se développer ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "Au XVIe siècle",
                "Au XVIIe siècle",
                "Au XVIIIe siècle"
        );

        QCM qcm52 =  QCM.saisie(
                "A partir de quelle durée hors de son domicile est-on considéré comme un touriste ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "Une semaine",
                "5 jours",
                "24 heures"
        );

        QCM qcm6 =  QCM.saisie(
                "Quelle est la particularité de la tour Albert, située dans le XIIIe arrondissement ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "C'est le seul monument du Corbusier à Paris",
                "Elle est inhabitée",
                "C'est la première tour d'habitation d e Paris"
        );
        QCM qcm61 =  QCM.saisie(
                "Où se trouve le mur des Fédérés ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "A Belleville",
                "A ménilmontant",
                "Au cimetière du Père-Lachaise"
        );

        QCM qcm7 =  QCM.saisie(
                "Quel est le développeur de la licence 'FIFA' ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "EA",
                "Infinity Ward",
                "Konami"
        );

        QCM qcm8 =  QCM.saisie(
                "Quel est le périmètre d'un carré de 7 cm de côté ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "14",
                "38",
                "28"
        );
        QCM qcm81 =  QCM.saisie(
                "Combien de côtés a un dodécagone ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "10",
                "8",
                "12"
        );

        QCM qcm9 =  QCM.saisie(
                "'La grande dépression', vous connaissez ? C'est",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "La grande famine de l'URSS (1931-1933)",
                "La vague de chaleur au Royaume-Uni en 1976",
                "La crise de 1929"
        );

        QCM qcm91 =  QCM.saisie(
                "Lequel de ces pays a envahi l'Ethiopie en 1935 - 1936 ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "Espagne",
                "Royaume-Uni",
                "Italie"
        );

        QCM qcm10 =  QCM.saisie(
                "Comment calcule-t-on l'aire d'un triangle ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "base x hauteur",
                "base x hauteur*2",
                "base x hauteur/2"
        );

        QCM qcm11 =  QCM.saisie(
                "Quelle est la distance du marathon?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(0),
                "38.5km",
                "43.2km",
                "42,195km"
        );

        QCM qcm12 =  QCM.saisie(
                "Quel jeu de Rockstar sorti en 2013 a fait le buzz pendant plusieurs semaines ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "Red Dead Redemption",
                "LOL",
                "GTA5"
        );

        QCM qcm13 =  QCM.saisie(
                "Que désignait le 'S T O' durant une certaine période du XXème siècle ?\n",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(2),
                "Sécurité du territoire ouest",
                "Service technique ouvrier",
                "Service du travail obligatoire"
        );
        QCM qcm14 =  QCM.saisie(
                "À quel personnage historique l’acronyme INRI fait-il référence ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                "César",
                "Virgile",
                "Jésus"
        );

        QCM qcm15 =  QCM.saisie(
                "A quoi sert un navigateur Internet ?",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(7),
                "à recharger la batterie de son ordinateur",
                "à guider un navire vers son port de destination",
                "à consulter et afficher le contenu des sites Web"
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
                "Le campus principal?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "Corki",
                "Paris",
                "République"
        );

        QCM qcm17 =  QCM.saisie(
                "Qui a inventé le stéthoscope ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "Claude Bernard",
                "Alexander Flemming",
                "René Laennec"
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
                "Quel est le trajet effectué par le premier à vapeur ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(1),
                "Lyon-Saint-Étienne"
        );

        RC rc4 =  RC.saisie(
                "Comment les premières années après la première guerre mondiale sont-elles appelées en France ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "Les années folles"
        );

        RC rc43 =  RC.saisie(
                "En Histoire qu'appelle-t-on 'Le Jour J' ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "Le 6 juin 1944"
        );

        RC rc44 =  RC.saisie(
                "Qui chantait 'Pour un petit tour, au petit jour, entre tes draps' ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                "Michel Delpech"
        );

        RC rc42 =  RC.saisie(
                "La coalition qui gouverna la France entre 1919 et 1924 est surnommée",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                "Le Bloc National"
        );

        RC rc41 =  RC.saisie(
                "Quel est le jeu de Naughty Dog sur les zombies ?",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "The Last of Us"
        );

        RC rc5 =  RC.saisie(
                "Quelle est la forme des faces d'un tétraèdre ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(3),
                "Triangulaire"
        );

        RC rc6 =  RC.saisie(
                "Quelle console est sortie le 22 novembre 2013 ?",
                
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(4),
                "Xbox One"
        );

        RC rc7 =  RC.saisie(
                "Combien y a-t-il de jours du Condor, dans titre du film de Sydney Pollack dans lequel jouent Robert Redford et Faye Dunaway ?",
                
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(5),
                "3 jours"
        );

        RC rc8 =  RC.saisie(
                "Où se déroule l'E3 ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(4),
                "Los Angeles"
        );

        RC rc9 =  RC.saisie(
                "fc barcelone en europa league ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "OUI"
        );

        RC rc10 =  RC.saisie(
                "Comment appelle-t-on des droites du plan qui ne se coupent pas ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(3),
                "droites parallèles"
        );

        RC rc11 =  RC.saisie(
                "Avast, MacAfee sont des logiciels :",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "antivirus"
        );

        RC rc112 =  RC.saisie(
                "Comment s'appelle une personne utilisant Internet :",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                "un internaute"
        );

        RC rc12 =  RC.saisie(
                "Quel est le plus grand parc d'attraction en France ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(6),
                "Eurodisney"
        );

        RC rc13 =  RC.saisie(
                "Efrei est le meilleur école en France?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(9),
                "OUI"
        );

        RC rc14 =  RC.saisie(
                "Qui a inventé la pile électrique ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "Volta"
        );

        RC rc15 =  RC.saisie(
                "Le campus de Gorki est le plus équipé",
                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(9),
                "NON"
        );

        RC rc155 =  RC.saisie(
                "Le campus de République est le plus équipé",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(9),
                "Oui"
        );

        RC rc16 =  RC.saisie(
                "Quel sport est arbitré obligatoirement en français ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                "L’escrime"
        );

        RC rc161 =  RC.saisie(
                "Un potage aux navets s'appelle un potage",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                "Fréneuse"
        );

        RC rc17 =  RC.saisie(
                "Quelle est la plus vieille centrale nucléaire de France ?",
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(1),
                "Fessenheim"
        );



        //Création des types VF
        VF vf1 =  VF.saisie(
                "Messi a remporté 7 ballons d'or ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(0),
                true
        );

        VF vf2 =  VF.saisie(
                "Les Alpes est la chaîne de montagne la plus touristique",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                true
        );

        VF vf3 =  VF.saisie(
                "Chrome est un navigateur",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(7),
                true
        );
        VF vf4 =  VF.saisie(
                "Un potage aux navets s'appelle un potage Fréneuse",
                
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(8),
                true
        );

        VF vf5 =  VF.saisie(
                "Spécialité de Vendée, haricots blancs sont les mogettes ?",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                true
        );

        VF vf6 =  VF.saisie(
                "On appelle pétrir une beurre avec du persil 'fraiser'",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                false
        );

        VF vf7 =  VF.saisie(
                "la locomotive à vapeur fut inventée en France ",
                
                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(2),
                false
        );

        VF vf8 =  VF.saisie(
                "un dodécagone a 10 côtés",
                
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
                " \"la roulade de Sévigné\" est dinde aux marrons",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(8),
                false
        );

        VF vf10 =  VF.saisie(
                "Un triangle peut-il être à la fois rectangle et isocèle ?",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(3),
                true
        );

        VF vf11 =  VF.saisie(
                "Au judo, Ceinture noire est le grade le plus élevé",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(0),
                true
        );

        VF vf12 =  VF.saisie(
                "Claude Bernard a inventé le stéthoscope",

                Difficulty.MEDIUM,
                Qrgame.getThemes().getThemes().get(1),
                false
        );
        VF vf13 =  VF.saisie(
                "Victor Hugo fut 'l'avocat' et le principal soutien de Dreyfus en 1898 ?",

                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(2),
                false
        );
        VF vf14 =  VF.saisie(
                "Mike Brant chantait 'Pour un petit tour, au petit jour, entre tes draps'",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(5),
                false
        );
        VF vf15 =  VF.saisie(
                "La grande Muraille de Chine n'est pas une des 7 nouvelles merveilles du monde",

                Difficulty.EASY,
                Qrgame.getThemes().getThemes().get(6),
                false
        );

        VF vf151 =  VF.saisie(
                "Google est un navigateur",

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
                "Roland Garros a gagné le premier tournoi de tennis en 1910 et donné son nom au court",

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
                "Les exams se trouve dans le bâtiment B?",
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
                "le nom du \"Call Of Duty\" sorti en 2011 est Ghosts",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(4),
                false
        );

        VF vf21 =  VF.saisie(
                "Mireille Darc jouait dans le film \"Belle de jour\" ?",
                Difficulty.HARD,
                Qrgame.getThemes().getThemes().get(5),
                false
        );




    }
}
