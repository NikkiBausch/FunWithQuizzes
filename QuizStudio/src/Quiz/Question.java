package Quiz;

public abstract class Question {
    private String query;
    private int score;


    public Question(String query, int score) {
        this.query = query;

        this.score = score;

    }


    public void displayQuestion(){
        System.out.println(this.query);


    }
    public void setScore(int x){
        this.score = x;
    }

    public int getScore(){
        return this.score;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


public abstract void displayAnswers();

    public abstract int getAnswers();


}
