package Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args){
        Quiz germanVocabQuiz = new Quiz(new ArrayList<>());
        ArrayList<String>possibleAnswer1 = new ArrayList<>(Arrays.asList("der Hund", "die Decke", "die Katze", "das Schuh"));
        ArrayList<Integer>correctAns1 = new ArrayList<>(Arrays.asList(1,3));
        checkBoxChoiceQuestions newQuestion1 = new checkBoxChoiceQuestions("Which of these words are animals in German?", 2, possibleAnswer1, correctAns1);
        germanVocabQuiz.addQuestion(newQuestion1);

        trueOrFalseQuestions newQuestion2 = new trueOrFalseQuestions(
                "True or False: Blau (blue) and rot (red) make Gelb.", 1,false);
        germanVocabQuiz.addQuestion(newQuestion2);
        ArrayList<String>posAns2 = new ArrayList<>(Arrays.asList("kochen,","haben", "schneiden,", "singen"));

        multipleChoiceQuestions newQuestion3 = new multipleChoiceQuestions("Which of these words means 'to cut' in German?", 1, posAns2,
                2);
        germanVocabQuiz.addQuestion(newQuestion3);

        germanVocabQuiz.runQuiz();
        germanVocabQuiz.gradeQuiz();

    }


}
