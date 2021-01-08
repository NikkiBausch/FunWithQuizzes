package Quiz;

public abstract class Question {
    private String question;
    private int score;


    public Question(String question, int score) {
        this.question = question;

        this.score = score;

    }


    public void displayQuestion(){
        System.out.println(this.question);


    }
    public void setScore(int x){
        this.score = x;
    }

    public int getScore(){
        return this.score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


public abstract void displayAnswers();

    public abstract int getAnswers();


}
