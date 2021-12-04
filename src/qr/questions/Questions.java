package qr.questions;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private static int NUMERO_DE_QUESTION = 1;
    private static List<Question> listOfAllQuestions;

    public Questions(){
        listOfAllQuestions = new ArrayList<Question>();
    }

    public static void addQuestion(Question question){
        listOfAllQuestions.add(question);
        //On  attribue comme numéro de question séquentielle la valeur
        //actuelle de NUMERO_DE_QUESTION

        question.setNumero(NUMERO_DE_QUESTION);
        NUMERO_DE_QUESTION+=1;
    }

    public static List<Question> getListOfAllQuestions() {
        return listOfAllQuestions;
    }

    public static void deleteQuestionByRank(int rank){
        listOfAllQuestions.remove(rank);
    }

    public static void selectQuestion(){
    }

    public static void getAllThemesWithQuestions(){

    }
}
