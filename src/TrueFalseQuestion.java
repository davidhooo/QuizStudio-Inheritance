package src;
import java.util.ArrayList;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionString) {
        this.questionString = "";
        this.answer = new ArrayList<String>();
        this.questionType = "True or False Question";

        this.questionString = questionString;
    }

//    public TrueFalseQuestion() {
//        this.questionString = "";
//        this.answer = new ArrayList<String>();
//    }

    public void setQuestion(String newQuestionString) {
        this.questionString = newQuestionString;
    }

    public void setAnswer(String answerString) {
        this.answer.add(answerString);
    }

    public String getQuestion() {
        return this.questionString;
    }

    public ArrayList<String> getAnswer() {
        return this.answer;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public boolean isCorrect(String userInputAnswer) {
        if (userInputAnswer.toLowerCase() == this.answer.toString().toLowerCase()) {
            return true;
        } else {
            return false;
        }
    }
}
