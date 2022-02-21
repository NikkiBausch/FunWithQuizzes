package Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args){
        Quiz germanVocabQuiz = new Quiz(new ArrayList<>());
        trueOrFalseQuestions newQuestion1 = new trueOrFalseQuestions("True or false: Austria has one official language, 10 officially recognized regional languages, and 3 popularly spoken minority languages.", 1, true);
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
