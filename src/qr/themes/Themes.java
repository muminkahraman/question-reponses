package qr.themes;

import java.util.ArrayList;
import java.util.Iterator;

public class Themes implements Iterable<Theme> {
    private static String[] THEME_TITLES = {
            "Sport", //index 0
            "Science", // 1
            "History", // 2
            "GEO", //     3
            "GAMING", //  4
            "CULTURE", // 5
            "TRAVELLING",// 6
            "INTERNET",// 7
            "FOOD",// 8
            "REAL_ESTATE"// 9
    };

    private static ArrayList<Theme> themeList;


    public Themes(){
        //Création en dur de tous les thèmes

        themeList = new ArrayList<Theme>();
        for(String s: THEME_TITLES){
            themeList.add(new Theme(s));
        }
    }

    public static ArrayList<Theme> getThemeList() {
        return themeList;
    }

    public static void afficherLesThemes() {
        String resultat = "Liste des thèmes\n--------------------\n";
        int i = 1;
        for(Theme t: themeList){
            resultat+= i+" - "+t.getDesignation()+"\n";
            ++i;
        }
        System.out.println(resultat);
    }

    //renvoie l'index d'un theme choisi
    public int chooseTheme(int chiffreChoisi){

        return themeList.indexOf(themeList.get(chiffreChoisi));
    }

    /**
     * retourne une représentation textuelle de tous les thèmes et
     * la valeur de leur indicateur
     * @return
     */
    @Override
    public String toString(){
        String allThemes = "";
        for(Theme theme: this ){
            allThemes+= theme.toString()+"\n";
        }
        return allThemes;
    }

    /**
     * méthode qui retourne une représentation textuelle de tous les thèmes et de
     * leurs questions
     * @return
     */
    public String getThemesWithQuestions(){
        String allThemesWithQuestions = "";
        for(Theme theme: this ){
            allThemesWithQuestions+= theme.toStringWithAllQuestions()+"\n";
        }
        return allThemesWithQuestions;
    }

    @Override
    public Iterator<Theme> iterator() {
        return themeList.iterator();
    }
}
