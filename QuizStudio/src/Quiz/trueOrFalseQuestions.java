package Quiz;

import java.util.Scanner;

public class trueOrFalseQuestions extends Question {
    private Boolean correctAnswer;


    public trueOrFalseQuestions(String query, int score, boolean correctAnswer) {
        super(query, score);
        this.correctAnswer = correctAnswer;

    }

    public boolean isCorrectAnswer(boolean possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");

    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for true and 'f' for false.");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

