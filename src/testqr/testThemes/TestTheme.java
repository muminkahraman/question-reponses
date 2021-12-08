package testqr.testThemes;

import qr.questions.Questions;
import qr.themes.Themes;

public class TestTheme {
    private static Themes themes = new Themes();
    private static Questions questions = new Questions();
    public static void main(String[] args){
        themes.afficherLesThemes();
        System.out.println(themes.getThemesWithQuestions());
        System.out.println(themes.getThemeList().get(1).getDesignation());
        System.out.println(themes.getThemeList().get(1).getChosenIndicator());

        themes.getThemeList().get(1).setChosenIndicator(1);
        System.out.println(themes.getThemeList().get(1).getChosenIndicator());


    }
}
