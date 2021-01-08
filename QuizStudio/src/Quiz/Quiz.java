package Quiz;

import java.util.ArrayList;

public class Quiz {
        private ArrayList<Question> questions;
        private int finalScore;
        private int total;

        public Quiz(ArrayList<Question> questions) {
            this.questions = questions;
            this.finalScore = 0;
            this.total = 0;
            for (int i = 0; i < questions.size(); i++) {
                this.total = this.total + questions.get(i).getScore();

            }
        }

            public void addQuestion(Question new Question){
                this.questions.add(new Question);
            this.total= this.total + new Question.getScore();

            }

            public void runQuiz(){
            for (int i=0; i<questions.size(); i++){
                questions.get(i).displayQuestion();
                questions.get(i).displayAnswers();
                int points = questions.get(i).getAnswers();
                updateScore(points);
            }
        }
            public void updateScore(){
            this.finalScore = this.finalScore + x;

        }
        public void gradeQuiz(){
            System.out.println("You finished the quiz! Your score is: " + finalScore + "/" + total);
        }

    }

}



