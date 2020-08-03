package src;
import java.util.ArrayList;


public abstract class Question {

    public String questionString;
    public ArrayList<String> answer;
    public String questionType;

    //Getters
    public abstract String getQuestion();
    public abstract ArrayList<String> getAnswer();
    public abstract String getQuestionType();

    //Setters
    public abstract void setQuestion(String questionString);
    public abstract void setAnswer(String answerString);
    public abstract void setQuestionType(String questionType);

    public abstract boolean isCorrect(String answer);
}
