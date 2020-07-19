package src;
import java.util.ArrayList;


public abstract class Question {

    public String questionString;
    public ArrayList<String> answer;
    public String questionType;

    //Getters
    public abstract String getQuestion();
    public abstract ArrayList<String> getAnswer();

    //Setters
    public abstract void setQuestion(String questionString);
    public abstract void setAnswer(String answerString);


}
