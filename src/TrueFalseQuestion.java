package src;
import java.util.ArrayList;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionString, String answerString) {
        this.questionString = "";
        this.answer = new ArrayList<String>();
        this.questionType = "True or False Question";

        this.questionString = questionString;
        this.answer.add(answerString);
    }

//    public TrueFalseQuestion() {
//        this.questionString = "";
//        this.answer = new ArrayList<String>();
//    }

    public void setQuestionString(String newQuestionString) {
        this.questionString = newQuestionString;
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
        if (userInputAnswer == this.answer.toString()) {
            return true;
        } else {
            return false;
        }
    }
}
