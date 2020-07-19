package src;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addTrueFalseQuestion("is dog an animal1?");
        quiz.addMultipleChoiceQuestion("Question A.  B.  C.");
        quiz.addCheckboxQuestion("Which numbers are even? 2, 4, 5, 8, 9");

        quiz.getQuestionAtIndex(0).setQuestion("Quest 1");
        quiz.getQuestionAtIndex(1).setQuestion("Question 2");
        quiz.getQuestionAtIndex(2).setQuestion("DKJlaf");

        quiz.getQuestionAtIndex(0).setAnswer("Answer1");
        quiz.getQuestionAtIndex(1).setAnswer("Answer2");
        quiz.getQuestionAtIndex(2).setAnswer("Answer3");
        quiz.getQuestionAtIndex(2).setAnswer("Answer4");

        System.out.println(quiz.getQuestionAtIndex(0).getQuestion());
        System.out.println(quiz.getQuestionAtIndex(1).getQuestion());
        System.out.println(quiz.getQuestionAtIndex(2).getQuestion());

        System.out.println(quiz.getQuestionAtIndex(0).getAnswer());
        System.out.println(quiz.getQuestionAtIndex(1).getAnswer());
        System.out.println(quiz.getQuestionAtIndex(2).getAnswer());


    }
}
