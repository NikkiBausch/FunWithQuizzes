package Quiz;

import java.util.ArrayList;
import java.util.Scanner;
public class multipleChoiceQuestions extends Question{
    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public multipleChoiceQuestions(String query, int score, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(query, score);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }


    @Override
    public void displayAnswers() {
        for (String answer: possibleAnswers) {
            System.out.println(answer);
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer){
        if(possibleAnswer == this.correctAnswer){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        return 0;
    }
}
