package src;

import java.util.ArrayList;

public class CheckboxQuestion extends Question {

    public CheckboxQuestion(String questionString) {
        this.questionString = "";
        this.answer = new ArrayList<String>();
        this.questionType = "Checkbox Question";

        this.questionString = questionString;
    }

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
}
