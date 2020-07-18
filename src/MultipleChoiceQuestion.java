package src;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String questionString, String answerString) {
        this.questionString = "";
        this.answer = new ArrayList<String>();
        this.questionType = "Multiple Choice Question";

        this.questionString = questionString;
        this.answer.add(answerString);
    }

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
}
