package qr.themes;

import qr.questions.Question;

import java.util.*;

public class Theme implements Iterable<Question> {
    private final String designation;
    private int chosenIndicator;//1 if chosen , o otherwise
    private List<Question> listThemeQuestions;

    public Theme(final String  designation){
        this.designation = designation;
        chosenIndicator = 0;
        listThemeQuestions = new ArrayList<Question>();
    }

    public String getDesignation() {
        return designation;
    }

    public List<Question> getListThemeQuestions() {
        return listThemeQuestions;
    }

    public int getChosenIndicator() {
        return chosenIndicator;
    }

    public void setChosenIndicator(int chosenIndicator) {
        this.chosenIndicator = chosenIndicator;
    }

    @Override
    public String toString(){
        return designation+" - Indicateur :"+chosenIndicator;
    }

    public String toStringWithAllQuestions(){
        String allQuestions = designation+"\n-------------\n";
        for(Question q : this){
            allQuestions += q.toString()+"\n";
        }
        return  allQuestions;
    }

    @Override
    public Iterator<Question> iterator() {
        return listThemeQuestions.iterator();
    }
}
