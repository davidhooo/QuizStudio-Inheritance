package src;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {

    private ArrayList<Question> listOfQuestions = new ArrayList<>();

    public void addTrueFalseQuestion(String questionString, String answerString) {
        TrueFalseQuestion newQuestion = new TrueFalseQuestion(questionString, answerString);
        listOfQuestions.add(newQuestion);
    }

    //TO DO: add addQuestions for other type of questions
    // get input method (scanner) make input method to get answer

    //getQuestion
    //scanner method for input
    //isCorrect method

    //askQuestion method


//    System.out.println("Question 1: ");
//    System.out.println(question1.getQuestion());


//    do {
//        userInput = input.nextLine();
//    } while (!userInput.equals(""));
//
//    System.out.println("You entered: " + userInput);
//    System.out.println(quiz.question1.isCorrect(userInput));
//
//    System.out.println("The answer is: ");
//    System.out.println(quiz.question1.getAnswer());
//    System.out.println(quiz.question1.getQuestionType());


}
