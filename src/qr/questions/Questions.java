package qr.questions;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private static int NUMERO_DE_QUESTION = 1;
    private List<Question> listOfAllQuestions;

    public Questions(){
        listOfAllQuestions = new ArrayList<Question>();
    }

    public void addQuestion(Question question){
        listOfAllQuestions.add(question);
        //On  attribue comme numeéro de question séquentielle la valeur
        //actuelle de NUMERO_DE_QUESTION

        question.setNumero(NUMERO_DE_QUESTION);
        NUMERO_DE_QUESTION+=1;
    }

    public void deleteQuestionByRank(int rank){
        listOfAllQuestions.remove(rank);
    }

    public void selectQuestion(){
    }

    public void getAllThemesWithQuestions(){
    }
}
