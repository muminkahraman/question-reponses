package qr.themes;

public class Themes {
    private static String[] THEME_TITLES = {"Sport", "Science", "History",
            "GEO", "GAMING","CULTURE", "TRAVELLING",
            "INTERNET", "FOOD", "REAL_ESTATE"};
    private Theme[] themeList;

    public Themes(){
        themeList = new Theme[10];
    }

    //renvoie l'index d'un theme
    public int choose1Theme(){
        return (int)Math.random()*10;
    }

    public void getAllThemesIndicator(){
        System.out.println("Affichage de thèmes");
    }
}
