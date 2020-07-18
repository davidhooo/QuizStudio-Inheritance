package src;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addTrueFalseQuestion("is dog an animal", "true");
    }
}

//        TrueFalseQuestion question1 = new TrueFalseQuestion("TRUE/FALSE: Is the Earth Flat?", "False");
//        TrueFalseQuestion question2 = new TrueFalseQuestion("TRUE/FALSE: Is the sun a Star", "False");
//        TrueFalseQuestion question3 = new TrueFalseQuestion("TRUE/FALSE: Is the Earth Flat?", "False");