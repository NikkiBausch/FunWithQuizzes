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
        Scanner answer = new Scanner(System.in);
        System.out.println("\"What will your answer be? Enter the number of the option you believe is correct. " +
                "For example, to select the first option, enter 1");
        int userAnswer = answer.nextInt();
        if(isCorrectAnswer(userAnswer)){
            return 1;
        }
        else {
            return 0;
        }
    }
}
