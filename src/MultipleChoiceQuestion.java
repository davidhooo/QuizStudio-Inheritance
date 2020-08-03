package src;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String questionString) {
        this.questionString = "";
        this.answer = new ArrayList<String>();
        this.questionType = "Multiple Choice Question";

        this.questionString = questionString;
    }

    public void setQuestion(String newQuestionString) {
        this.questionString = newQuestionString;
    }

    public void setAnswer(String answerString) {
        this.answer.add(answerString);
    }

    public void setQuestionType(String questionType) {this.questionType = questionType;}

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
        return userInputAnswer.toLowerCase().equals(this.answer.get(0).toLowerCase());
    }
}
