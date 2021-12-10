package qr.themes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
            "EFREI"// 9
    };

    private List<Theme> themes;


    public Themes(){
        //Création en dur de tous les thèmes

        themes = new ArrayList<Theme>();
        for(String s: THEME_TITLES){
            themes.add(new Theme(s));
        }
    }

    public  List<Theme> getThemes() {
        return themes;
    }

    public  void afficherLesThemes() {
        String resultat = "Liste des thèmes\n--------------------\n";
        int i = 1;
        for(Theme t: themes){
            resultat+= i+" - "+t.getDesignation()+"\n";
            ++i;
        }
        System.out.println(resultat);
    }

    //renvoie l'index d'un theme choisi
    public int chooseTheme(int chiffreChoisi){

        return themes.indexOf(themes.get(chiffreChoisi));
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
        return themes.iterator();
    }
}
