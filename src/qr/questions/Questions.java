package qr.questions;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private static int NUMERO_DE_QUESTION = 1;
    private  List<Question> allQuestions;

    public Questions(){
        allQuestions = new ArrayList<Question>();
    }

    public  void addQuestion(Question question){
        allQuestions.add(question);
        //On  attribue comme numéro de question séquentielle la valeur
        //actuelle de NUMERO_DE_QUESTION

        question.setNumero(NUMERO_DE_QUESTION);
        NUMERO_DE_QUESTION+=1;
    }

    public  List<Question> getListOfAllQuestions() {
        return allQuestions;
    }

    public  void deleteQuestionByRank(int rank){
        allQuestions.remove(rank);
    }

    public  void selectQuestion(){
    }

    public  void getAllThemesWithQuestions(){

    }
}
