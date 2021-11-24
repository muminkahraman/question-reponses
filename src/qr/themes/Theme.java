package qr.themes;

import qr.questions.Question;

import java.util.*;

public class Theme {
    private String designation;
    private int chosenIndicator;
    private List<Question> listThemeQuestions;

    public Theme(String designation){
        this.designation = designation;
        chosenIndicator = 0;
        listThemeQuestions = new ArrayList<Question>();
    }

    public int getChosenIndicator() {
        return chosenIndicator;
    }

    public void setChosenIndicator(int chosenIndicator) {
        this.chosenIndicator = chosenIndicator;
    }
}
