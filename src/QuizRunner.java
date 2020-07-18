package src;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner input = new Scanner(System.in);
        String userInput;

//        SHITTY CASTING EXAMPLE (if question1 object was of QUESTION type)
//        Question qqq = quiz.question1;
//        System.out.println(((TrueFalseQuestion)qqq).getAnswer());

        System.out.println("Question 1: ");
        System.out.println(quiz.question1.getQuestion());

        do {
            userInput = input.nextLine();
            } while (!userInput.equals(""));

        System.out.println("You entered: " + userInput);
        System.out.println(quiz.question1.isCorrect(userInput));

        System.out.println("The answer is: ");
        System.out.println(quiz.question1.getAnswer());
        System.out.println(quiz.question1.getQuestionType());
    }
}
